
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextLong();
    long a = sc.nextLong(); 
    long[][] p = new long[n][2];
    for(int i = 0; i < n; i++) {
      p[i][0] = sc.nextLong();
      p[i][1] = sc.nextLong(); 
    }
    Arrays.sort(p, new Comparator<long[]>() {
               @Override
               public int compare(long[] o1, long[] o2) {
                 return (int)o1[0] - (int)o2[0];
               }
    });
    int[] in = new int[n];
    long[] rui = new long[n];
    for(int i = 0; i < n; i++) {
      int ans = i;
      int left = i;
      int right = n;
      while(left < right) {
        int med = (left + right) / 2;
        if((p[med][0] - p[i][0]) <= (2 * d)) {
          ans = med;
          left = med + 1;
        } else {
          right = med;
        }
      }
      in[i] = ans;
    }
    int[] m = new int[n];
    int q = 0;
    m[0] = 0;
    for(int i = 1; i < n; i++) {
      for(int j = q; j <= i; j++) {
        if(in[j] >= i) {
          m[i] = j;
          q = j;
          break; 
        }
      }
    }
    long ans = (p[0][1] + a - 1) / a;
    rui[0] = (ans * a); 
    for(int i = 1; i < n; i++) {
      if(m[i] > 0) {
        p[i][1] -= (rui[i - 1] - rui[m[i] - 1]);
      } else {
        p[i][1] -= rui[i - 1]; 
      }
      if(p[i][1] > 0) {
        ans += (p[i][1] + a - 1) / a;
        rui[i] = rui[i - 1] + ((p[i][1] + a - 1) / a) * a;
      } else {
        rui[i] = rui[i - 1];
      }
    }
    System.out.println(ans);
  }
}
