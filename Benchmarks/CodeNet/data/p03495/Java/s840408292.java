import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int k = Integer.parseInt(lines[1]);

      int[] arr = new int[n+1];
      Set<Integer> set = new HashSet<>();

      String line = in.readLine();
      char regex = ' ';
      boolean isContinue = true;
      for(int m=0,offset=0,next=0; isContinue; offset = ++next) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        m = Integer.parseInt(line.substring(offset,next));
        arr[m]++;
        set.add(m);
      }
      Arrays.sort(arr);
      // for (int i : arr) {
      //   System.out.print(i + " ");
      // }
      // System.out.println();
      int g = set.size();
      int ans = 0;
      for(int i=n-g+1; i<=n-k; i++) {
          ans += arr[i];
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}