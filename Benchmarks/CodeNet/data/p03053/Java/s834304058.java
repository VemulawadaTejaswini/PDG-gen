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

        int[][] costMap = new int[h][w];
        costMap = bfs(startPointList, h, w, c);

        int answer = -1;
        for(int y = 0;y < h;y++) {
            for(int x = 0;x < w;x++) {
                if(c[y][x] =='#') continue;
                answer = answer < costMap[y][x] ? costMap[y][x] : answer;
            }
        }
        
        answer = answer == -1 ? 0 : answer;
        System.out.println(answer);
    }

    private static int[][] bfs(List<Point> startPointList, int h, int w, char[][] c) {
        Deque<Point> q = new ArrayDeque<>();
        boolean[][] footprints = new boolean[h][w];

        int[][] costMap = new int[h][w];
        for(int y = 0;y < h;y++) for(int x = 0;x < w;x++) costMap[y][x] = Integer.MAX_VALUE;
        for(Point p : startPointList) {
            q.offer(p);
            footprints[p.y][p.x] = true;
            costMap[p.y][p.x] = 0;
        }
        
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
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