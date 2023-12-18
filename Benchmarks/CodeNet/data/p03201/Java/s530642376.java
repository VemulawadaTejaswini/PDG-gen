import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < N; i++) set.add(scanner.nextInt());
    int cnt = 0;
    while (!set.isEmpty()) {
      int a = set.pollLast();
      int b = (Integer.highestOneBit(a) << 1) - a;
      if (set.remove(b)) cnt++;
    }
    System.out.println(cnt);
  }
}
