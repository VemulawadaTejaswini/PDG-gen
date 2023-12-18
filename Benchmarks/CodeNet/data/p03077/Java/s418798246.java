import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

          final long n = atol(in.readLine());
          List<Long> list = new ArrayList<>();
          for (int i = 0; i < 5; i++) {
            list.add(atol(in.readLine()));
          }

          final long m = Collections.min(list);
          
          final long ans = 5 + n / m;
          System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  int  atoi(String s) { return Integer.parseInt(s); }
  long atol(String s) { return Long.parseLong(s);   }
}