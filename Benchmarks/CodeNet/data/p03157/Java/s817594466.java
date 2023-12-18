import java.util.Scanner;

public class Main {

    static int H, W;
    static char[][] grid;
    static int[][] visited;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        grid = new char[H][W];
        for(int i = 0; i < H; i++) grid[i] = sc.next().toCharArray();
        sc.close();
        visited = new int[H][W];
        long ans = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                long[] ret = new long[2];
                ret = dfs(i, j);
                ans += ret[0] * ret[1];
            }
        }
        System.out.println(ans);

    }
    private static long[] dfs(int i, int j) {
        long[] ret = new long[2];
        if(visited[i][j] == 1) return ret;
        visited[i][j] = 1;
        if(grid[i][j] == '.') ret[0]++;
        else ret[1]++;
        for(int[] d:dir){
            int ni = i +d[0];
            int nj = j +d[1];
            if(ni >=0 && ni <H && nj >=0 && nj <W){
                if(visited[ni][nj] == 0 && grid[ni][nj] != grid[i][j]){
                    long[] ret2 = dfs(ni, nj);
                    ret[0] += ret2[0];
                    ret[1] += ret2[1];
                }
            }
        }

        return ret;
    }

}
