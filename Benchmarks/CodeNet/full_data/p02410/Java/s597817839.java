import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main{

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      String[] lines = br.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int m = Integer.parseInt(lines[1]);
      int[][] mA = new int[n][m];
      int[]   vb = new int[m];
      int[]   vc = new int[n];

      for(int i = 0; i < n; i++ ) {
        lines = br.readLine().split(" ");
        for( int j = 0; j < m; j++ ) {
          mA[i][j] = Integer.parseInt(lines[j]);
        }
      }
      for( int i = 0; i < m; i++ ) {
        lines = br.readLine().split(" ");
        vb[i] = Integer.parseInt(lines[0]);
      }

      for( int i = 0; i < n; i++ ) {
        for( int j = 0; j < m; j++ ){
          vc[i] += mA[i][j] * vb[j];
        }
        System.out.println(vc[i]);
      }
    }
  }
}
