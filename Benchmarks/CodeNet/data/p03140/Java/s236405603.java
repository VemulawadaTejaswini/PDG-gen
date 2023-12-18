import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N =scanner.nextInt();
    char[] A = scanner.next().toCharArray();
    char[] B = scanner.next().toCharArray();
    char[] C = scanner.next().toCharArray();
    int res = 0;
    for (int i = 0; i < N; i++) res += numMinOp(A[i], B[i], C[i]);
    System.out.println(res);
  }

  private static int numMinOp(char a, char b, char c) {
    if (a == b && b == c) return 0;
    if (a == b || b == c || a == c) return 1;
    return 2;
  }
}
