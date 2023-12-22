
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by chinalife on 2019/7/25.
 */
public class Main {
    public static int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();
        sc.nextLine();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < w; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        int[][] factory = new int[n + 1][2];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == 'S') {
                    factory[0][0] = i;
                    factory[0][1] = j;
                } else if (Character.isDigit(map[i][j])) {
                    int num = map[i][j]-'0';
                    factory[num][0] = i;
                    factory[num][1] = j;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += bfs(factory[i][0], factory[i][1], factory[i + 1][0], factory[i + 1][1], map);
        }
        System.out.println(result);
    }

    /*
    使用bfs返回从当前节点到下一个节点的最短距离
     */
    public static int bfs(int sx, int sy, int ex, int ey, char[][] map) {
        int[][] distance = new int[map.length][map[0].length];
        for (int i = 0; i < distance.length; i++) {
            Arrays.fill(distance[i], -1);
        }
        distance[sx][sy] = 0;
        Queue<Point> queue = new LinkedList<>();
        Point p = new Point(sx,sy);
        queue.add(p);
        //int res = 0;
        while (!queue.isEmpty()){
            Point temp = queue.poll();
            if(temp.x == ex && temp.y == ey){
                break;
            }
            for(int i = 0;i < direction.length;i++){
                int newX = temp.x+direction[i][0];
                int newY = temp.y+direction[i][1];
                if(newX>=0 && newX < map.length && newY >= 0 && newY < map[0].length
                        && map[newX][newY] !='X' && distance[newX][newY] == -1){
                    distance[newX][newY] = distance[temp.x][temp.y]+1;
                    Point curr = new Point(newX,newY);
                    queue.add(curr);
                }
            }
        }
        return distance[ex][ey];
    }

    static class Point {
         int x;
         int y;
        Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }
}

