import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    if (N <= M) {
      for (int i = 0; i < M; i++) {
        System.out.print(N);
        i++;
      }
    }
      else if (M < N) {
        for (int j = 0; j < N; j++) {
          System.out.print(M);
          j++;
        }
      }
    }
  }