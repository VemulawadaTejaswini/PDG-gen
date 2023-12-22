import java.io.*;
import java.util.*;


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

      StringBuilder sb = new StringBuilder();
        for (int a : scores) sb.append(a).append(' ');
        System.out.println(sb.deleteCharAt(sb.length()-1).toString());

    }
  }