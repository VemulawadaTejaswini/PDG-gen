import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = parseInt(in.readLine());
      int[] seq = new int[n];

      for(int i=0; i<n; i++)
        seq[i] = parseInt(in.readLine());

      Arrays.parallelSort(seq);
      // int[] res = new int[n];

      int k = n>>1;
      int l = n - 1;
      int ans = 0;
      for(int i=0; i<k; i++) {
        ans += seq[l-i] - seq[i];
      }
      ans *= 2;
      if(k > 1) ans--;

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}