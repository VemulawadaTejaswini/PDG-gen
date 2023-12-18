import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] D = new int[K];

    for (int i = 0; i < K; i++) {
      D[i] = sc.nextInt();
    }

    sc.close();

    for (int i = N; i < N * 10; i++) {
      boolean valid = true;
      for (int j = 0; j < K; j++) {
        String d = String.valueOf(i);
        String d_ = String.valueOf(D[j]);
        if ((d.indexOf(d_) != -1)){
          valid = false;
        }
      }
      if (valid) {
        System.out.println(i);
        break;
      }
    }

  }

}