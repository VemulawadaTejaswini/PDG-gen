import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int k = 0;
    long t = 0;
    long tt = 26;
    while(t < n) {
      t += tt;
      tt *= 26;
      k++;
    }
    String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    long r = n;
    for(int i = 1; i < k; i++) {
      r -= (long)Math.pow(26, i);
    }
    String ans = "";
    for(int i = 1; i <= k; i++) {
      int rr = (int)(r % 26);
      if((rr % 26) == 0) {
        ans = s[25] + ans;
        r = (r / 26);
      } else {
        ans = s[rr - 1] + ans;
        r = (r / 26) + 1;
      }
    }
    System.out.println(ans);
  }
}