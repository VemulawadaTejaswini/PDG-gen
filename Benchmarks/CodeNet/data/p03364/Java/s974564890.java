import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    char in[][] = new char[N][N];
    for (int i = 0; i < N; i++) {
      String str = sc.next();
      for (int j = 0; j < N; j++) {
        in[i][j] = str.charAt(j);
      }
    }
    int count = 0;
    boolean errorFlag = false;
    for (int t = 0; t < N; t++) {
      errorFlag = false;
      for (int i = 1; i < N; i++) {
        for (int j = 0; j < i; j++) {
          if (in[i][(j + t) % N] != in[j][(i + t) % N]) {
            errorFlag = true;
            break;
          }
        }
        if (errorFlag) {
          break;
        }
      }
      if (!errorFlag) {
        count++;
      }
    }

    System.out.println(count * N);
  }
}