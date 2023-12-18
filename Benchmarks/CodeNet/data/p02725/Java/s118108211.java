import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int n = sc.nextInt();

    int min = Integer.MAX_VALUE;
    int before = sc.nextInt();
    int first = before;
    int second = 0;
    for (int i = 1; i < n - 1; i++) {
      int current = sc.nextInt();
      int clock = k - (current - before);
      before = current;
      if (first == 0 && i == 1) {
        second = current;
      }
      if (clock < min) {
        min = clock;
      }
    }

    int last = sc.nextInt();
    int unClock = first == 0 ? k - (k - last + second) : k - (k - last + first);
    if (unClock < min) {
      min = unClock;
    }

    System.out.println(min);
  }
}
