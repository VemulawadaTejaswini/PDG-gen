import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[M];
    String[] S = new String[M];
    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt();    
      S[i] = sc.next();    
    }
    sc.close();

    boolean[] ac = new boolean[N];
    int[] pe = new int[N];
    for (int i = 0; i < M; i++) {
      int p = P[i] - 1;
      String s = S[i];
      if (ac[p]) continue;
      if ("WA".equals(s)) {
        pe[p]++;
      } else if ("AC".equals(s)) {
        ac[p] = true;
      }
    }
    int ans1 = 0;
    for (int i = 0; i < N; i++) if (ac[i]) ans1++;
    int ans2 = 0;
    for (int i = 0; i < N; i++) ans2 += pe[i];
    System.out.println(ans1 + "  " + ans2);
  }
}