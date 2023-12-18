import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    if (valid(S, A, B)) System.out.println("Yes");
    else System.out.println("No");
  }
  
  private static boolean valid(char[] S, int A, int B) {
    if (S.length != A + B + 1) return false;
    for (int i = 0; i < A; i++) {
      if (S[i] < '0' || S[i] > '9') return false;
    }
    if (S[A] != '-') return false;
    for (int i = A + 1; i < A + B + 1; i++) {
      if (S[i] < '0' || S[i] > '9') return false;
    }
    return true;
  }
}
