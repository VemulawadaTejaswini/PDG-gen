import java.util.*;

public class Main {
    static int max;
    static int h;
    static int w;
    static List<Integer> list;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == '.') {
                    for (int k = 0; k < h; k++) {
                        for (int l = 0; l < w; l++) {
                            if (i == k && j == l) continue;
                            if (board[k][l] == '.') {
                                Boolean[][] visited = new Boolean[h][w];
                                for (int s = 0; s < h; s++) {
                                    for (int t = 0; t < w; t++) {
                                        visited[s][t] = false;
                                    }
                                }
                                visited[i][j] = true;
                                list = new ArrayList<Integer>();
                                f(board, i, j, k, l, visited, 0);
                                int min= 500;
                                for (Integer li : list) {
                                    //System.out.println(li);
                                    min = Math.min(min, li);
                                }
                                //System.out.println(-1);
                                max = Math.max(max,min);
                            }
                        }
                    }
                }
            }
        }
        // int min = 500;
        // boolean[][] visited = new boolean[h][w];
        // visited[0][0] = true;
        // list = new ArrayList<Integer>();
        // f(board, 0, 0, 0, 1, visited, 0);
        // for (Integer li : list) {
        //     System.out.println(li);
        //     min = Math.min(min, li);
        // }
        System.out.println(max);
    }
    
    public static void f(char[][] board, int nowh, int noww, int goalh, int goalw, Boolean[][] visited, int nowhosuu) {
        if (nowh == goalh && noww == goalw) {
            list.add(nowhosuu);
            return;
        }
        
        if (nowh < h - 1 && board[nowh+1][noww] == '.' && !visited[nowh+1][noww]) {
            Boolean[][] visited2 = new Boolean[h][w];
            for (int i = 0; i < h; i++) {
                visited2[i] = visited[i].clone();
            }
            visited2[nowh+1][noww] = true;
            f(board, nowh+1, noww, goalh, goalw, visited2, nowhosuu+1);
        }
        if (nowh > 0 && board[nowh-1][noww] == '.' && !visited[nowh-1][noww]) {
            Boolean[][] visited2 = new Boolean[h][w];
            for (int i = 0; i < h; i++) {
                visited2[i] = visited[i].clone();
            }
            visited2[nowh-1][noww] = true;
            f(board, nowh-1, noww, goalh, goalw, visited2, nowhosuu+1);
        }
        if (noww < w - 1 && board[nowh][noww+1] == '.' && !visited[nowh][noww+1]) {
            Boolean[][] visited2 = new Boolean[h][w];
            for (int i = 0; i < h; i++) {
                visited2[i] = visited[i].clone();
            }
            visited2[nowh][noww+1] = true;
            f(board, nowh, noww+1, goalh, goalw, visited2, nowhosuu+1);
        }
        if (noww > 0 && board[nowh][noww-1] == '.' && !visited[nowh][noww-1]) {
            Boolean[][] visited2 = new Boolean[h][w];
            for (int i = 0; i < h; i++) {
                visited2[i] = visited[i].clone();
            }
            visited2[nowh][noww-1] = true;
            f(board, nowh, noww-1, goalh, goalw, visited2, nowhosuu+1);
        }
    }
}
