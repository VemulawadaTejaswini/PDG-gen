import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    new ABC128B2().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

        int n = Integer.parseInt(in.readLine());

        String[][] ss = in.lines()
          .limit(n)
          .map(l -> l.split(" "))
          .toArray(String[][]::new);

        Map<String,Integer> map = new HashMap<>();
        IntStream.range(0, n)
          .forEach(i -> map.put(ss[i][0]+ss[i][1], i+1));

        Arrays.parallelSort(ss, (a, b) -> {
          if(!a[0].equals(b[0]))
            return a[0].compareTo(b[0]);
          else
            return - Integer.parseInt(a[1]) + Integer.parseInt(b[1]);
        });

        Arrays.stream(ss).forEach(s -> out.println(map.get(s[0]+s[1])));
        out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}