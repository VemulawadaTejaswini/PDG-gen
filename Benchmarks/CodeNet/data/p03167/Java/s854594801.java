import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int pathCount(char[][] grid){
        int[][] sum = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0){
                    if (grid[i][j] == '#'){
                        sum[i][j] = 0;
                    }else{
                        sum[i][j] = 1;
                    }
                }else {
                    if (grid[i][j] == '#'){
                        sum[i][j] = 0;
                    }else {
                        int top, left;
                        if (i == 0) {
                            top = 0;
                        } else {
                            top = sum[i-1][j];
                        }
                        if (j==0){
                            left = 0;
                        }else {
                            left = sum[i][j-1];
                        }
                        sum[i][j] = top + left;
                        if (sum[i][j] > mod){
                            sum[i][j] -= mod;
                        }
                    }
                }
            }
        }
        return sum[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int r,c;
        StringTokenizer st = new StringTokenizer(reader.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        char[][] grid = new char[r][c];
        for (int i = 0; i < r; i++) {
            String line = reader.readLine();
            for (int j = 0; j < c; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        System.out.println(pathCount(grid));
    }

    private static int mod = (int) (Math.pow(10, 9)+7);
}
