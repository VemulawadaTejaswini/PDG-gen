import java.util.HashSet;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int h = scanner.nextInt();
    final int w = scanner.nextInt();
    int[] rows = new int[h];
    int[] cols = new int[w];
    for (int i = 0; i < h; i++) {
      char[] chars = scanner.next().toCharArray();
      for (int j = 0; j < chars.length; j++) {
        int value = chars[j] - 'a';
        rows[i] += value;
        cols[j] += value;
      }
    }
    HashSet<Integer> set = new HashSet<>();
    for (int r : rows) {
      if (set.contains(r)) set.remove(r);
      else set.add(r);
    }
    if (set.size() > 1) {
      System.out.println("NO");
      return;
    }
    set.clear();
    for (int c : cols) {
      if (set.contains(c)) set.remove(c);
      else set.add(c);
    }
    if (set.size() > 1) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
}
