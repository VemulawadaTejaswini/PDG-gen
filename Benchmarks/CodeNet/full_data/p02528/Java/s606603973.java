import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

      String line_1 = buf.readLine();
      int n = Integer.parseInt(line_1);
      int[] scores = new int[n];
      String line_2 = buf.readLine();
      for(int i=0; i<n; i++){
        scores[i] = Integer.parseInt(line_2.split(" ")[i]);
      }
      Arrays.sort(scores);

      String t = "";
      for(int j=0; j<(n-1); j++){
        t += String.valueOf(scores[j]) + " ";
      }
      t += String.valueOf(scores[n-1]);

      System.out.println(t);
    }
  }