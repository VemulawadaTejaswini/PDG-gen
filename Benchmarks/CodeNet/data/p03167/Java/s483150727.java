import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main
{
    public static final int MOD = 1_000_000_007;
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new FileReader("pathsonagrid.txt"));
        Scanner in = new Scanner(System.in);
 
//        StringTokenizer line = new StringTokenizer(in.readLine());
        StringTokenizer line = new StringTokenizer(in.nextLine());
 
        int n = Integer.parseInt(line.nextToken());
        int m = Integer.parseInt(line.nextToken());
        
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++)
//            grid[i] = in.readLine().trim().toCharArray();
            grid[i] = in.nextLine().trim().toCharArray();
        
        int[][] paths = new int[n][m];
        paths[0][0] = 1;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (grid[r][c] == '#')
                    continue;
                try { //look above
                    paths[r][c] += paths[r-1][c] % MOD;
                } catch (Exception e) {}
                try { //look left
                    paths[r][c] += paths[r][c-1] % MOD;
                } catch (Exception e) {}
            }
        }
        
        System.out.println(paths[n-1][m-1] % MOD);
    }
}