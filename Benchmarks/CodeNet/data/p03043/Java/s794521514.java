import java.util.*;
import java.io.*;

public class Main {
  public static void main(String ... args) throws Exception {
    int n = 0, k = 0;
    String s;
    try (BufferedReader isr = new BufferedReader(new InputStreamReader(System.in))) {
      String buf = isr.readLine();
      System.err.println(buf);
      //
      String[] input = buf.split(" ");
      n = Integer.parseInt(input[0]);
      k = Integer.parseInt(input[1]);
      /*
      buf = isr.readLine();
      System.err.println(buf);
      // */
      s = buf;
    }

    double res = 0;
    for (int i=1; i<=n; i++) {
      double d = Math.log1p(k/n - 1);
      res += Math.pow(0.5, (int)Math.ceil(d)) / n;
    }
    
    System.out.println(res);
  }

}
