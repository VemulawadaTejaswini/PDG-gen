import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t[] = {60, 60, 24};
    int x[] = new int[3];
    int S = in.nextInt();
    for (int i = 0; i < 3; i++) {
      x[i] = S % t[i];
      S = S / t[i];
    }
    System.out.printf("%d:%d:%d\n", x[2], x[1], x[0]);
  }
}