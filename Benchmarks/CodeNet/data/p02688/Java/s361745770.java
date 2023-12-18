import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    boolean[] hasSweets = new boolean[N+1];
    for (int i = 0; i < K; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) hasSweets[sc.nextInt()] = true;
    }
    int ans = 0;
    for (boolean h : hasSweets) if (!h) ans++;
    System.out.println(ans-1);
  }
}