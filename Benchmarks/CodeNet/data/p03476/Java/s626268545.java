import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Q = sc.nextInt();
    int[] l = new int[Q];
    int[] r = new int[Q];
    int max = 0;
    for (int i = 0; i < Q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
      max = Math.max(max, r[i]);
    }

    boolean[] prime = new boolean[max+5];
    for (int i = 2; i <= max; i++) {
      boolean isPrime = true;
      for (int j = 2; j*j <= i; j++) {
        if (i%j == 0) {
          isPrime = false;
          break;
        }
      }
      prime[i] = isPrime;
    }
    
    int[] cnt = new int[max+5];
    for (int i = 1; i <= max; i++) {
      if (prime[i] && prime[(i+1)/2]) {
        cnt[i] = cnt[i-1]+1;
      } else {
        cnt[i] = cnt[i-1];
      }
    }
    
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < Q; i++) {
      ans.append(cnt[r[i]] - cnt[l[i]-1]).append('\n');
    }

    System.out.print(ans.toString());
  }
}