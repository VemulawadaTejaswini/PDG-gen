import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int R = sc.nextInt();
    int G = sc.nextInt();
    int B = sc.nextInt();
    int N = sc.nextInt();
    
    int count = 0;
    for (int r = 0; r * R <= N; r++) {
      for (int g = 0; r * R + g * G <= N; g++) {
        int b = (N - r * R - g * G) / B;
        if (r * R + g * G + b * B == N) {
          count++;
        }
      }
    }

    os.println(count);
  }
}