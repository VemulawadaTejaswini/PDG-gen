import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int D = sc.nextInt();
    int x2000 = sc.nextInt();
    int[] x = new int[10];
    System.out.println(r * x2000 -D);
    for (int i=1; i<10; i++) {
      x[0] = r * x2000 - D;
      x[i] = r * x[i-1] -D;
      System.out.println(x[i]);
    }
  }
}