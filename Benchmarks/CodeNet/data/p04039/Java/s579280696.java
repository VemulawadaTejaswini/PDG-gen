import java.util.*;

public class Main {
  private static boolean valid(int n, HashSet<Integer> ds) {
    while (n > 0) {
      if (ds.contains(n % 10)) {
        return false;
      }
      n /= 10;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    HashSet<Integer> ds = new HashSet<Integer>();
    for (int i = 0; i < k; i++) {
      int d = s.nextInt();
      ds.add(d);
    }
    while(true) {
      if (valid(n, ds)) {
        System.out.println(n);
        return;
      }
      n++;
    }
  }
}
