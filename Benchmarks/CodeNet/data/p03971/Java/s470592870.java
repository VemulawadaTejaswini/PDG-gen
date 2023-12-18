import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    StringBuilder sb = new StringBuilder();
    int count = 0;
    int cb = 0;
    for (int i = 0; i < N; i++) {
      if ((S[i] == 'a' && count < A + B) || (S[i] == 'b' && count < A + B && cb < B)) {
        count++;
        if (S[i] == 'b') cb++;
        sb.append("Yes").append('\n');
      } else {
        sb.append("No").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}
