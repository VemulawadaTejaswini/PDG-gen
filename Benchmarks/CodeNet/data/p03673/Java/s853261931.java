import java.util.*;

public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Deque<Integer>  box = new ArrayDeque<>();
      for (int i = 1; i <= n; i++) {
        if(n % 2 == i % 2) {
            box.addFirst(sc.nextInt());
        } else {
            box.addLast(sc.nextInt());
        }
      }
      box.stream()
              .forEach(e -> System.out.print(e  + " "));
  }
}