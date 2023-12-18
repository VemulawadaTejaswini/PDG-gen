import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] S = new String[N];
    int[] P = new int[N];
    String[] ans = new String[N];
    for (int i = 0; i < N; i++) {
      S[i] = sc.next();
      P[i] = sc.nextInt();
      ans[i] = S[i] + " " + P[i];
    }
    Arrays.sort(ans);
    //System.out.println(Arrays.toString(S));
    //System.out.println(Arrays.toString(P));
    
    for (int i = 0; i < N; i++) {
      System.out.println(ans[i]);
    }
  }
}

