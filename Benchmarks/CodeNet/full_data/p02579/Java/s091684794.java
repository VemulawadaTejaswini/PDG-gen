import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    char[][] map;
    int[][] roads;
    int h;
    int w;

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        h = Integer.parseInt(tokenizer.nextToken());
        w = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(f.readLine());
        int x0 = Integer.parseInt(tokenizer.nextToken()) - 1;
        int y0 = Integer.parseInt(tokenizer.nextToken()) - 1;
        tokenizer = new StringTokenizer(f.readLine());
        int x1 = Integer.parseInt(tokenizer.nextToken()) - 1;
        int y1 = Integer.parseInt(tokenizer.nextToken()) - 1;
        map = new char[h][w];
        for (int i = 0; i <h; i++) map[i] = f.readLine().toCharArray();

        roads = new int[h][w];
        for (int i = 0; i < h; i++) for (int j = 0; j < w; j++) roads[i][j] = -1;
        int currRoad = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == '.' && roads[i][j] == -1) {
                    ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
                    roads[i][j] = currRoad;
                    int[] pos = {i, j};
                    queue.addLast(pos);
                    while (!queue.isEmpty()) {
                        pos = queue.removeFirst();

                        for (int x = -1; x <= 1; x += 2) {
                            if (goodAdjacent(pos[0] + x, pos[1])) {
                                roads[pos[0] + x][pos[1]] = currRoad;
                                int[] newPos = {pos[0] + x, pos[1]};
                                queue.addLast(newPos);
                            }
                        }

                        for (int y = -1;  y <= 1; y += 2) {
                            if (goodAdjacent(pos[0], pos[1] + y)) {
                                roads[pos[0]][pos[1] + y] = currRoad;
                                int[] newPos = {pos[0], pos[1] + y};
                                queue.addLast(newPos);
                            }
                        }
                    }
                    currRoad++;
                }
            }
        }

        HashSet<Integer>[] connectedTo = new HashSet[currRoad];
        for (int i = 0; i < currRoad; i++) connectedTo[i] = new HashSet<Integer>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = -2; k <= 2; k++) {
                    for (int l = -2; l <= 2; l++) {
                        if (map[i][j] == '#') continue;
                        if (goodMagic(roads[i][j], i + k, j + l)) {
                            connectedTo[roads[i][j]].add(roads[i + k][j + l]);
                        }
                    }
                }
            }
        }

        int[] startRoad = {roads[x0][y0], 0};
        int[] shortesPathToRoad = new int[currRoad];
        Arrays.fill(shortesPathToRoad, -1);
        boolean[] visited = new boolean[currRoad];
        ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        visited[startRoad[0]] = true;
        queue.addLast(startRoad);
        while (!queue.isEmpty()) {
            int[] road = queue.removeFirst();
            //System.out.println(road[0] + " " + road[1]);
            shortesPathToRoad[road[0]] = road[1];
            for (int adjacent : connectedTo[road[0]]) {
                if (!visited[adjacent]) {
                    int[] newRoad = {adjacent, road[1] + 1};
                    visited[adjacent] = true;
                    queue.addLast(newRoad);
                }
            }
        }

        out.println(shortesPathToRoad[roads[x1][y1]]);

        out.close();
    }

    private boolean goodAdjacent(int i, int j) {
        return i >= 0 && i < h && j >= 0 && j < w  && map[i][j] == '.' && roads[i][j] == -1;
    }

    private boolean goodMagic(int road, int i, int j) {
        return i >= 0 && i < h && j >= 0 && j < w  && map[i][j] == '.' && roads[i][j] != road;
    }
}