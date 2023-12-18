import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int X = scanner.nextInt() - 1;
    Set<Integer> tolls = new HashSet<>();
    for (int i = 0; i < M; i++) tolls.add(scanner.nextInt() - 1);
    int left = 0, right = 0;
    for (int i = X; i >= 0; i--) if (tolls.contains(i)) left++;
    for (int i = X; i < N; i++) if (tolls.contains(i)) right++;
    System.out.println(Math.min(left, right));
  }
}
