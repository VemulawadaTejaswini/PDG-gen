import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      final int n = sc.nextInt();

      if(n == 0) break;

      int[] sales = new int[10];
      for(int i = 0; i < 10; i++) sales[i] = 0;

      for(int i = 0; i < n; i++) sales[sc.nextInt()]++;

      for(int i = 0; i < 10; i++) {
        if(sales[i] == 0) System.out.print("-");
        else for(int j = 0; j < sales[i]; j++) System.out.print("*");

        System.out.println();
      }
    }
  }

  private Scanner sc = new Scanner(System.in);
}