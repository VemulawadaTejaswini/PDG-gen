import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.next());
    long sum[] = new long[n + 1];
    sum[0] = 0;
    long xor[] = new long[n + 1];
    xor[0] = 0;
    for (int i = 1; i < n + 1; i++) {
      long a = Long.parseLong(sc.next());
      sum[i] = sum[i - 1] + a;
      xor[i] = xor[i - 1] ^ a;
    }
    
    int ans = 0;
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (sum[i] - sum[j] == (xor[i] ^ xor[j])) {
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}