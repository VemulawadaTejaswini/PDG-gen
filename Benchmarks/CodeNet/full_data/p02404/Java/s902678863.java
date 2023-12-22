import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
 
  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      StringBuilder output = new StringBuilder();
      String[] lines;
      int h,w;

      while (true) {
        lines = br.readLine().split(" ");
        h = Integer.parseInt(lines[0]);
        w = Integer.parseInt(lines[1]);

        if(h==0 && w==0){ break; }

        for( int i = 1; i <= h; i++){
          for( int j = 1; j <= w; j++){
            if( i == 1 || i == h) output.append("#");
            else {
              if( j == 1 || j == w) output.append("#");
              else output.append(".");
            }
          }
          output.append("\n");
        }

        System.out.println(output);

        output.setLength(0);
      }
    }
  }
}
