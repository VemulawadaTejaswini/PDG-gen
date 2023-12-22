import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var c = br.readLine().toCharArray();

      final var rList = new TreeSet<Integer>();
      final var wList = new TreeSet<Integer>();
      for (int i = 0; i < c.length; i++) {
        if (c[i] == 'W') wList.add(i);
        if (c[i] == 'R') rList.add(i);
      }
      final var rSize = rList.size();
      final var wSize = wList.size();

      int count = 0;
      while (!rList.isEmpty() && !wList.isEmpty() && rList.last() > wList.first()) {
        int last = rList.last();
        int first = wList.first();
        rList.remove(last);
        wList.add(last);
        rList.add(first);
        wList.remove(first);
        count++;
      }

      System.out.println(Math.min(Math.min(count, rSize), wSize));
    }
  }
}
