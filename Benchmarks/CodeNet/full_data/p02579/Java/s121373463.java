import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);        
    public static void main(String[] args) {
        int R = sc.nextInt(), C = sc.nextInt(), sx = sc.nextInt()-1, sy = sc.nextInt()-1, gx = sc.nextInt()-1, gy = sc.nextInt()-1;
        sc.nextLine();
        char[][] matrix = new char[R][C];
        for (int i = 0; i < R; i++) {
            matrix[i] = sc.nextLine().toCharArray();
        }
        int[][] visited = new int[R][C];
        Queue<Integer[]> que = new ArrayDeque<>();
        Queue<Integer[]> wallQue = new ArrayDeque<>();
        Integer[] cord = {sx, sy};
        que.add(cord);
        visited[sx][sy] = 1;
        int ans = 0;
        int[][] moves = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
        int[][] allMoves = {{1,1},{1,-1}, {-1, 1}, {-1, -1}, {1,0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!que.isEmpty()){
            for (int i = 0; i < que.size(); i++) {
                cord = que.poll();
                int row = cord[0], col = cord[1];
                char e = matrix[row][col];
                int[][] m;
                if (e=='.'){
                    m = moves;
                }else{
                    m = allMoves;
                }
                for (int[] move:m){
                    int nrow = row+move[0], ncol = col+move[1];
                    if (isSafe(nrow, ncol, R, C) && visited[nrow][ncol] == 0){
                        if (nrow == gx && ncol == gy){
                            System.out.println(ans);
                            System.exit(0);
                        }
                        Integer[] newCord = {nrow, ncol};
                        if (matrix[nrow][ncol] == '#'){
                            if (e=='.'){wallQue.add(newCord);}
                        }else{
                            que.add(newCord);
                        }
                        visited[nrow][ncol] = 1;
                    }
                }
            }
            if (que.isEmpty()){
                que = wallQue;
                wallQue = new ArrayDeque<>();
                ans++;
            }
        }
        System.out.println(-1);
    }
    static boolean isSafe(int row, int col, int R, int C){
        return row >= 0 && col >= 0 && row < R && col < C;
    }
}