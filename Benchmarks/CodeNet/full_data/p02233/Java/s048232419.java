import java.util.Scanner;
public class Main {
  public static int getFib(int n) {
    if (n == 0)
      return 1;
    if (n == 1)
      return 1;
    int j = 1;
    int k = 1;
    int sum = 0;
    for (int i = 2; i <= n; i++) {
      sum = j + k;
      j = k;
      k = sum;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.close();
    System.out.println(getFib(n));
  }
}

