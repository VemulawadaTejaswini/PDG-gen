
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) throws IOException{
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        
        String line = reader.readLine();
        String[] columns = new String[200];
        columns = line.split(" ");
        int yc = Integer.parseInt(columns[0]); // 3
        int xc = Integer.parseInt(columns[1]); // 4
        int[][] bec = new int[xc][yc];
        int[] m = new int[xc];   // 4
        int [] sum =new int[xc]; // 4
        
        for (int y = 0; y < yc; y++) {
            line = reader.readLine();
            columns = line.split(" ");
            for ( int x = 0 ; x < xc; x++ ) {
                bec[x][y] = Integer.parseInt(columns[x]);
            }
        }
        for (int x = 0; x < xc; x++) {
            line = reader.readLine();
            m[x] = Integer.parseInt(line);
        }
        for (int y = 0; y < yc ; y++) {
            sum[y] = 0;
            for (int x = 0; x < xc ; x++ ) {
                sum[y] += (m[x] * bec[x][y]);
            }
            System.out.println(sum[y]);
        }
    }
}