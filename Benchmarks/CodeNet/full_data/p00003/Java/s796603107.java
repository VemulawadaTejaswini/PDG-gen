import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      String[] line;
      int l = 0;
      StringBuilder result = new StringBuilder();

      for(int i=0; i<n; i++) {
        line = br.readLine().split(" ");
        for(int j=0,m; j<3; j++) {
          m = Integer.parseInt(line[j]);
          if( l < m ) l = m;
        }
        
        result.append( l%5 == 0 ? "YES" : "NO").append("\n");
      }

      System.out.print(result);
    }
  }
}
