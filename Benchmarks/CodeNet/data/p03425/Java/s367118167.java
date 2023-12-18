import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] D = new long[5];
    for (int i = 0; i < N; i++) {
      String name = sc.next();
      if (name.charAt(0) == 'M') D[0]++;
      if (name.charAt(0) == 'A') D[1]++;
      if (name.charAt(0) == 'R') D[2]++;
      if (name.charAt(0) == 'C') D[3]++;
      if (name.charAt(0) == 'H') D[4]++;
    }
    long res = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = i+1; j < 5; j++) {
        for (int k = j+1; k < 5; k++) {
          res += D[i] * D[j] * D[k];
        }
      }
    }
    System.out.println(res);
  }
}
