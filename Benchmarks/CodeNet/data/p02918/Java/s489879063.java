import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    char[] S = sc.next().toCharArray();
    int score = 0;
    for (int i = 0; i < N-1; i++) {
      if (S[i] == S[i+1]) {
        score++;
      }
    }
    int ans = Math.min(N-1, score+2*K);
    System.out.println(ans);
  }
}