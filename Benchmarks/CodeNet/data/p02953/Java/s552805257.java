import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long[] H = new long[N];
    for (int i = 0; i < N; i++) {
      H[i] = Long.parseLong(sc.next());
    }

    boolean bool = true;
    int cnt = 0;
    for (int i = H.length-1; i > 0; i--) {
      if (H[i] + 1 == H[i-1]) {
        if (cnt == 0) {
          cnt++;
          H[i-1]--;
        }
        if (cnt > 1) {
          bool = false;
          break;
        }
        continue;
      }

      if (H[i] + 2 <= H[i-1]) {
        bool = false;
        break;
      }
    }

    System.out.println(bool ? "Yes" : "No");
  }
}

// 1 2 4 3 2
// 1 2 3 3 2
// 1 2 