import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    if (possible(N, A - 1, B - 1, C - 1, D - 1, S)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean possible(int N, int A, int B, int C, int D, char[] S) {
    for (int i = A; i < C; i++) if (S[i] == '#' && S[i + 1] == '#') return false;
    for (int i = B; i < D; i++) if (S[i] == '#' && S[i + 1] == '#') return false;
    if (C < D) return true;
    for (int i = B; i < D - 1; i++) if (S[i] == '.' && S[i + 1] == '.' && S[i + 2] == '.') return true;
    return false;
  }
}
