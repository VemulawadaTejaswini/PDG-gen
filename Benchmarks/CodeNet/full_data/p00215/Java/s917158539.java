import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        int result = Integer.MAX_VALUE;
        for (Position p1 : field.elements.get(getNextElementNum(startElement))) {
            for (Position p2 : field.elements
                    .get(getNextElementNum(startElement + 1))) {
                for (Position p3 : field.elements
                        .get(getNextElementNum(startElement + 2))) {
                    for (Position p4 : field.elements
                            .get(getNextElementNum(startElement + 3))) {
                        int totalDistance = dist(field.start, p1)
                                + dist(p1, p2) + dist(p2, p3) + dist(p3, p4)
                                + dist(p4, field.end);
                        if (totalDistance < result) {
                            result = totalDistance;
                        }
                    }
                }
            }
        }

        return result;
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

}