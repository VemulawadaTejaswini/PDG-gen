
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long K = sc.nextLong() + 1;
    long[] k = new long[40];
    for(int j = 0; j < 40; j++) {
      k[j] = (K % 2);
      K /= 2; 
    }  
    long[][] a = new long[n][40];
    long[][] b = new long[40][2];
    for(int i = 0; i < n; i++) {
      long A = sc.nextLong();
      for(int j = 0; j < 40; j++) {
        a[i][j] = (A % 2);
        if(a[i][j] == 0) {
          b[j][0]++;
        } else {
          b[j][1]++;
        }
        A /= 2; 
      }
    }
    long[] ansh = new long[40];
    for(int i = 39; i >= 0; i--) {
      long t = 0;
      if(k[i] == 1) {
        for(int j = 39; j >= 0; j--) {
          if(j < i) {
            int d = (int)(1 - k[i]);
            t += (b[i][d] * (long)Math.pow(2, i));
          } else if(j == i) {										    t += (b[i][1] * (long)Math.pow(2, i));						
          } else {
            t += (Math.max(b[i][0] * (long)Math.pow(2, i), b[i][1] * (long)Math.pow(2, i)));
          }
        }
      }
      ansh[i] = t;
    }
    long ans = 0;
    for(int i = 0; i < 40; i++) {
      ans = Math.max(ans, ansh[i]);
    }
    System.out.println(ans);
  }
}