import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    char[] T = new char[S.length + 1];
    System.arraycopy(S, 0, T, 0, S.length);
    T[S.length] = S[0];
    int K = scanner.nextInt();
    long res = 0;
    for (int i = 1; i < T.length; i++) {
      if (T[i] == T[i - 1]) {
        res++;
        i++;
      }
    }
    res *= K;
    if (T[T.length - 1] == T[T.length - 2] && T.length > 2 && T[T.length - 2] != T[T.length - 3]) res--;
    System.out.println(res);
  }
}
