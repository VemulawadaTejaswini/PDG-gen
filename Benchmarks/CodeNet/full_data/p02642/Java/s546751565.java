import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Set<Integer> buf = new TreeSet<>();
    Set<Integer> redundUnder1000 = new TreeSet<>();
    Set<Integer> redundOver1000 = new TreeSet<>();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (buf.contains(a) && a <= 1000) redundUnder1000.add(a);
      else if (buf.contains(a) && a > 1000) redundOver1000.add(a);
      else buf.add(a);
    }

    for (int m : redundOver1000) buf.remove(m);

    n = buf.size();
    int[] a = new int[n];
    int tmp = 0;
    Set<Integer> idx = new HashSet<>();
    for (int m : buf) {
      a[tmp] = m;
      idx.add(tmp++);
    }

    int pos = 0;
    while (pos < n) {

      if (a[pos] > 1000) break;

      if (!idx.contains(pos)) {
        pos++; continue;
      }

      int d = a[pos];
      pos++;
      for (int i = pos; i < n; i++) {
        if (idx.contains(i) && a[i] % d == 0)  {
          idx.remove(i);
        }
      }
    }

    System.out.println(idx.size() - redundUnder1000.size());

  }
}
