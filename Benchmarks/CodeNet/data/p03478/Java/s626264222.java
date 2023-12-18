import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    long sum = 0;
    for (int i = 1; i <= N; i++) {
      int dsum = dsum(i);
      if (dsum >= A && dsum <= B) sum += i;
    }
    System.out.println(sum);
  }
  
  private static int dsum(int a) {
    int t = 0;
    while (a > 0) {
      t += a % 10;
      a /= 10;
    }
    return t;
  }
}