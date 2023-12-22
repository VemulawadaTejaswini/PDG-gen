import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    long k = scan.nextLong();

    long[] a = new long[n];
    long[] b = new long[m];
    boolean flg = false;
    int sum = 0;


    for(int i = 0; i < n; i++) {
      a[i] = scan.nextLong();
      if(!flg){
        if(k >= a[i]) {
          flg = true;
        }
      }
    }
    for(int i = 0; i < m; i++) {
      b[i] = scan.nextLong();
      if(!flg){
        if(k >= b[i]) {
          flg = true;
        }
      }
    }

    n = 0;
    m = 0;

    if(flg) {
      while(sum < k) {
        if(n < a.length && m < b.length) {
          if(a[n] < b[m]) {
            if(sum + a[n] <= k) {
              sum += a[n];
              n++;
            } else {
              break;
            }
          } else {
            if(sum + b[n] <= k) {
              sum += b[m];
              m++;
            } else {
              break;
            }
          }
        } else if (n < a.length) {
          if(sum + a[n] <= k) {
            sum += a[n];
            n++;
          } else {
            break;
          }
        } else if (m < b.length) {
          if(sum + b[n] <= k) {
            sum += b[m];
            m++;
          } else {
            break;
          }
        } else {
          break;
        }
      }
    }

    System.out.println(n + m);
  }
}
