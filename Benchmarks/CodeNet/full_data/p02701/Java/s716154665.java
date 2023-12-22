import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(final String[] args) throws Exception {
    try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String l = r.readLine();
      int n = Integer.parseInt(l);
      Set<String> s = new HashSet<String>();
      for (int i = 0; i < n; i++) {
        l = r.readLine();
        s.add(l);
      }
      System.out.println(s.size());
    }
  }
}