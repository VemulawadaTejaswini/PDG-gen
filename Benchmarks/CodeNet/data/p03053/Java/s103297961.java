import java.awt.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        char[][] c = new char[h][w];
        List<Point> startPointList = new ArrayList<>();
        for(int y = 0;y < h;y++) {
            char[] line = sc.next().toCharArray();
            for(int x = 0;x < w;x++) {
                c[y][x] = line[x];
                if(line[x] == '#') startPointList.add(new Point(x, y));
            }
        }

        int[][][] costMapList = new int[startPointList.size()][h][w];
        for(int i = 0;i < startPointList.size();i++) {
            costMapList[i] = bfs(startPointList.get(i).x, startPointList.get(i).y, h, w, c);
        }

        int answer = -1;
        for(int y = 0;y < h;y++) {
            int minCost = Integer.MAX_VALUE;
            for(int x = 0;x < w;x++) {
                if(c[y][x] =='#') continue;
                for(int i = 0;i < startPointList.size();i++) {
                    int cost = costMapList[i][y][x];
                    minCost = cost < minCost ? cost : minCost;
                }

                answer = answer < minCost ? minCost : answer;
                minCost = Integer.MAX_VALUE;
            }
        }

        System.out.println(answer);
    }

    private static int[][] bfs(int startX, int startY, int h, int w, char[][] c) {
        Deque<Point> q = new ArrayDeque<>();
        q.offer(new Point(startX, startY));
        boolean[][] footprints = new boolean[h][w];
        footprints[startY][startX] = true;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        int[][] costMap = new int[h][w];
        for(int y = 0;y < h;y++) {
            for(int x = 0;x < w;x++) costMap[y][x] = Integer.MAX_VALUE;
        }
        costMap[startY][startX] = 0;

        while(!q.isEmpty()) {
            Point p = q.poll();

            for(int i = 0;i < 4;i++) {
                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];
                if(canGo(nextX, nextY, h, w, c, footprints)) {
                    q.offer(new Point(nextX, nextY));
                    footprints[nextY][nextX] = true;
                    int pScore = costMap[p.y][p.x];
                    if(pScore + 1 < costMap[nextY][nextX]) costMap[nextY][nextX] = pScore + 1;
                }
            }
        }

        return costMap;
    }

    private static boolean canGo(int x, int y, int h, int w, char[][] c, boolean[][] footprints) {
        if(x < 0 || x >= w || y < 0 || y >= h) return false;
        if(footprints[y][x]) return false;
        if(c[y][x] == '#') return false;

        return true;
    }

}