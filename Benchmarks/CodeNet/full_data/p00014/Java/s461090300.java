import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      int d = sc.nextInt();

      int sum = 0;
      for(int i = 0; i < 600; i += d) {
        sum += d * i * i;
      }

      System.out.println(sum);
    }
  }

  private final Scanner sc = new Scanner(System.in);
}