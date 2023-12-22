import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Set distinctSet = new TreeSet();
    for (int i = 0; i < n; i++) {
      distinctSet.add(sc.nextInt());
    }

    int[] a = new int[distinctSet.size()];
    int ctr = 0;
    Set idx = new HashSet();
    for (int m : distinctSet) {
      a[ctr] = m;
      idx.add(ctr++);
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

    System.out.println(idx.size());

  }
}
