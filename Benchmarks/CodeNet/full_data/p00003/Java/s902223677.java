import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      String[] line;
      int[] l = new int[]{0,0,0};
      String ans;
      StringBuilder result = new StringBuilder();

      for(int i=0; i<n; i++) {
        ans = "NO";
        line = br.readLine().split(" ");
        l[0] = Integer.parseInt(line[0]);
        l[1] = Integer.parseInt(line[1]);
        l[2] = Integer.parseInt(line[2]);

        for(int j=0,t; j<3; j++) {
          for(int k=0; k<3; k++) {
            if( l[j] < l[k] ) {
              t = l[j];
              l[j] = l[k];
              l[k] = t;
            }
          }
        }

        if( l[0]*l[0] + l[1]*l[1] == l[2]*l[2] )
          ans = "YES";
        result.append( ans ).append("\n");
      }

      System.out.print(result);
    }
  }
}
