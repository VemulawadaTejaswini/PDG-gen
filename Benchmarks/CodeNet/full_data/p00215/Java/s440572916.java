import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static Pattern PATTERN_FIELD_START = Pattern.compile("\\d \\d");

    public static void main(String[] args) {
        // 読み込んでフィールドを作る
        Scanner sc = new Scanner(System.in);

        List<String> fieldInput = new ArrayList<String>();
        while (sc.hasNext()) {
            String input = sc.nextLine();
            if (PATTERN_FIELD_START.matcher(input).matches()) {
                // 「n n」形式だったらフィールド開始なので、バッファリングした文字を基にフィールドを作る
                if (fieldInput.isEmpty()) {
                    continue;
                }
                PachimonField field = craeteField(fieldInput);
                searchMinimal(field);

                fieldInput.clear();
            } else {
                // それ以外の形式であればフィールド情報なのでバッファリング
                fieldInput.add(input);
            }
        }

    }

    /** フィールドを作る */
    private static PachimonField craeteField(List<String> fieldInput) {
        PachimonField field = new PachimonField();

        for (int y = 0; y < fieldInput.size(); y++) {
            String xAxis = fieldInput.get(y);
            for (int x = 0; x < xAxis.length(); x++) {
                char c = xAxis.charAt(x);

                switch (c) {
                // だっさい処理だなぁ…
                case 'S':
                    field.start = new Position(x, y);
                    break;
                case 'G':
                    field.end = new Position(x, y);
                    break;
                case '1':
                    field.elements.get(1).add(new Position(x, y));
                    break;
                case '2':
                    field.elements.get(2).add(new Position(x, y));
                    break;
                case '3':
                    field.elements.get(3).add(new Position(x, y));
                    break;
                case '4':
                    field.elements.get(4).add(new Position(x, y));
                    break;
                case '5':
                    field.elements.get(5).add(new Position(x, y));
                    break;
                default:
                    // not any
                }
            }
        }

        return field;
    }

    /** 属性を指定せず最小距離を出す */
    private static void searchMinimal(PachimonField field) {
        int minDistance = Integer.MAX_VALUE;
        int element = -1;

        for (int i = 1; i <= 5; i++) {
            int distance = searchMinimalByElement(i, field);
            if (distance != -1 && distance < minDistance) {
                minDistance = distance;
                element = i;
            }
        }

        if (element == -1) {
            System.out.println("NA");
        } else {
            System.out.println(Integer.toString(element) + " "
                    + Integer.toString(minDistance));
        }

    }

    /** 属性を指定して最小距離を出す */
    private static int searchMinimalByElement(int startElement,
            PachimonField field) {

        if (field.elements.get(getNextElementNum(startElement)).size() == 0
                || field.elements.get(getNextElementNum(startElement + 1))
                        .size() == 0
                || field.elements.get(getNextElementNum(startElement + 2))
                        .size() == 0
                || field.elements.get(getNextElementNum(startElement + 3))
                        .size() == 0) {
            // 手持ち以外の属性が居なければクリア不可能
            return -1;
        }

        Dijkstra dijkstra = new Dijkstra(4002);

        // start→e1
        int i = 3;
        for (Position p1 : field.elements.get(getNextElementNum(startElement))) {
            dijkstra.setCost(1, i, dist(field.start, p1));
            i++;
        }

        // e1->e2
        i = 3;
        for (Position p1 : field.elements.get(getNextElementNum(startElement))) {
            int j = 3 + 1000;
            for (Position p2 : field.elements
                    .get(getNextElementNum(startElement + 1))) {
                dijkstra.setCost(i, j, dist(p1, p2));
                j++;
            }
            i++;
        }

        // e2->e3
        i = 3 + 1000;
        for (Position p2 : field.elements
                .get(getNextElementNum(startElement + 1))) {
            int j = 3 + 2000;
            for (Position p3 : field.elements
                    .get(getNextElementNum(startElement + 2))) {
                dijkstra.setCost(i, j, dist(p2, p3));
                j++;
            }
            i++;
        }

        // e3->e4
        i = 3 + 2000;
        for (Position p3 : field.elements
                .get(getNextElementNum(startElement + 2))) {
            int j = 3 + 3000;
            for (Position p4 : field.elements
                    .get(getNextElementNum(startElement + 3))) {
                dijkstra.setCost(i, j, dist(p3, p4));
                j++;
            }
            i++;
        }

        // e4->g
        i = 3 + 3000;
        for (Position p4 : field.elements
                .get(getNextElementNum(startElement + 3))) {
            dijkstra.setCost(i, 2, dist(p4, field.end));
            i++;
        }

        return dijkstra.getCost(1, 2);
    }

    private static int getNextElementNum(int elementNum) {
        int result = (elementNum % 5) + 1;
        return result;
    }

    /** 移動距離 */
    private static int dist(Position from, Position to) {
        return(Math.abs(from.x - to.x) + Math.abs(from.y - to.y));
    }

    /** 場所を表すオブジェクト */
    private static class Position {
        public int x;

        public int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /** フィールド情報を表すオブジェクト */
    private static class PachimonField {
        public Position start;

        public Position end;

        public Map<Integer, List<Position>> elements = new HashMap<Integer, List<Position>>();

        public PachimonField() {
            this.elements.put(1, new ArrayList<Position>());
            this.elements.put(2, new ArrayList<Position>());
            this.elements.put(3, new ArrayList<Position>());
            this.elements.put(4, new ArrayList<Position>());
            this.elements.put(5, new ArrayList<Position>());
        }
    }

    private static class Dijkstra {
        private int[][] graph;

        private boolean[] visited;

        private PriorityQueue<int[]> que;

        public Dijkstra(int size) {
            this.graph = new int[size + 1][size + 1];
            this.visited = new boolean[size + 1];
            this.que = new PriorityQueue<int[]>(size + 1,
                    new Comparator<int[]>() {
                        @Override
                        public int compare(int[] o1, int[] o2) {
                            return o1[1] - o2[1];
                        }
                    });
        }

        public void setCost(int i, int j, int cost) {
            this.graph[i][j] = cost;
        }

        public int getCost(int start, int end) {
            Arrays.fill(this.visited, false);
            this.que.clear();

            this.visited[start] = true;

            for (int i = 1; i < this.graph.length; ++i) {
                if (this.graph[start][i] > 0) {
                    this.que.add(new int[] {i, this.graph[start][i]});
                }
            }

            int cost = 0;

            while (!this.que.isEmpty()) {
                int[] partitionCost = this.que.poll();
                if (partitionCost[0] == end) {
                    cost = partitionCost[1];
                    break;
                }
                this.visited[partitionCost[0]] = true;

                for (int i = 1; i < this.graph.length; ++i) {
                    if (!this.visited[i] && this.graph[partitionCost[0]][i] > 0) {
                        this.que.add(new int[] {
                                i,
                                partitionCost[1]
                                        + this.graph[partitionCost[0]][i]});
                    }
                }
            }
            return cost;

        }
    }

}