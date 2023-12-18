import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] S = new int[N];
    for (int i = 0; i < N; i++) {
      String name = sc.next();
      if (name.charAt(0) == 'M') S[0]++;
      if (name.charAt(0) == 'A') S[1]++;
      if (name.charAt(0) == 'R') S[2]++;
      if (name.charAt(0) == 'C') S[3]++;
      if (name.charAt(0) == 'H') S[4]++;
    }
    long comb = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = i+1; j < 5; j++) {
        for (int k = j+1; k < 5; k++) {
          comb += S[i] * S[j] * S[k];
        }
      }
    }
    System.out.println(comb);
  }
}
