import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      // int n = Integer.parseInt(lines[0]);
      int k = Integer.parseInt(lines[1]);

      Map<Integer,Integer> map = new HashMap<>();
      String line = in.readLine();
      char regex = ' ';
      boolean isContinue = true;
      for(int m=0,offset=0,next=0; isContinue; offset = ++next) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        m = Integer.parseInt(line.substring(offset,next));

        if(map.containsKey(m)) {
          map.replace(m, map.get(m)+1);
        }
        else {
          map.put(m, 1);
        }
      }

      int g = map.size();
      int[] v = new int[g];
      int j = 0;
      for (Integer i : map.values()) {
        v[j++] = i;
      }
      Arrays.parallelSort(v);
      // for (int i : v) {
      //   System.out.print(i + " ");
      // }
      // System.out.println();
      int ans = 0;
      for(int i=0; i<g-k; i++) {
        ans += v[i];
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}