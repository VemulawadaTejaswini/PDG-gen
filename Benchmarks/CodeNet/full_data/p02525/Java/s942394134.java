import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

      for(;;){
        String line = buf.readLine();
        int n = Integer.parseInt(line);
        if(n == 0) break;
        String line_2 = buf.readLine();
        int[] scores = new int[n];
        int b = 0;

        for(int i=0; i<n; i++){
          scores[i] = Integer.parseInt(line_2.split(" ")[i]);
          b = b + scores[i];
      }
      double m = b/n;


      double c = 0; double d = 0;
      for(int j=0; j<n; j++){
        c = Math.pow(scores[j]-m, 2);
        d = d + c;
      }
      double sd = Math.sqrt(d/n);
      System.out.println(sd);


      }


  }
}