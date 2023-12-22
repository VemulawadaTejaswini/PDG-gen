import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    Group belong[] = new Group[n + 1];
    for (int i = 0; i < m; i++) {
      int from = Integer.parseInt(sc.next());
      int to = Integer.parseInt(sc.next());
      if (belong[from] == null && belong[to] == null) {
        Group g = new Group();
        g.add(from);
        g.add(to);
        belong[from] = g;
        belong[to] = g;
      } else if (belong[from] == null && belong[to] != null) {
        Group g = belong[to];
        g.add(from);
        belong[from] = g;
      } else if (belong[from] != null && belong[to] == null) {
        Group g = belong[from];
        g.add(to);
        belong[to] = g;
      } else {
        Group fromG = belong[from];
        Group toG = belong[to];
        if (fromG == toG) {
          continue;
        }
        fromG.merge(toG);
        belong[to] = fromG;
      }
    }
    pw.println(
      Arrays.stream(belong)
        .filter(Objects::nonNull)
        .mapToInt(Group::numberOfPersons)
        .max()
        .orElse(1)
    );
  }

  static class Group {

    Set<Integer> person = new HashSet<>();

    void merge(Group g) {
      person.addAll(g.person);
    }

    void add(Integer p) {
      person.add(p);
    }

    int numberOfPersons() {
      return person.size();
    }
  }
}
