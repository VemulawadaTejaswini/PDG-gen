import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);

        String[] grid = new String[H];

        for(int i=0; i<H; i++) {
            grid[i] = br.readLine();
        }

        System.out.println(getWays(grid, H, W));
    }

    private static int getWays(String[] grid, int H, int W) {
        int[][] ways = new int[H][W];

        for(int i=0; i<W; i++) {
            if(grid[0].charAt(i) == '#') {
                break;
            }

            ways[0][i] = 1;
        }

        for(int i=0; i<H; i++) {
            if(grid[i].charAt(0) == '#') {
                break;
            }

            ways[i][0] = 1;
        }

        for(int i=1; i<H; i++) {
            for(int j=1; j<W; j++) {
                if(grid[i].charAt(j) != '#') {
                    ways[i][j] = (ways[i - 1][j] + ways[i][j - 1]) % MOD;
                }
            }
        }

        return ways[H-1][W-1];
    }
}
