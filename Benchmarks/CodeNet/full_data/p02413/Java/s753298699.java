import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      int count = 0;
      int n,x;
      String[] lines;

      while(true){

        lines = br.readLine().split(" ");
        n = Integer.parseInt( lines[0] );
        x = Integer.parseInt( lines[1] );
        if( n == 0 && x == 0) break;

        for( int i = 1; i < n-1; i++ ){
          for( int j = i+1; j < n; j++ ) {
            for( int k = j+1; k <= n; k++ ){
              if ( (i + j + k)  > x ) break;
              if ( (i + j + k) == x ){
                count++;
                // System.out.println( i + " " + j + " " + k);
              }
            }
          }
        }
        System.out.println(count);
        count = 0;
      }
    }
  }
}
