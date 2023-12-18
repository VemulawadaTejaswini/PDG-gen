import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    int ans = 0;
    long sum = 0;
    for(int i = 0; i < N; i++) {
      int a = sc.nextInt();
      long b = sc.nextLong();
      sum += b;
      if(sum >= K) {
        ans = a;
        break;
      }
    }
    System.out.println(ans);
  }
}