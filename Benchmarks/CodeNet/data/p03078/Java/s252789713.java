import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[x];
    long[] b = new long[y];
    long[] c = new long[z];
    for(int i = 0; i < x; i++) {
      a[i] = sc.nextLong();
    }
    for(int i = 0; i < y; i++) {
      b[i] = sc.nextLong();
    }
    for(int i = 0; i < z; i++) {
      c[i] = sc.nextLong();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    long s = 0;
    int p1 = x - 1;
    int p2 = y - 1;
    int p3 = z - 1;
    for(int i = 0; i < k; i++) {
      s = a[p1] + b[p2] + c[p3];
      System.out.println(s);
      long t1 = 0;
      long t2 = 0;
      long t3 = 0;
      if(p1 > 0) t1 = a[p1 - 1] + b[p2] + c[p3];
      if(p2 > 0) t2 = a[p1] + b[p2 - 1] + c[p3];
      if(p3 > 0) t3 = a[p1] + b[p2] + c[p3 - 1];
      if(t1 >= t2) {
        if(t1 >= t3) {
          p1 -= 1;
        } else {
          p3 -= 1;
        }
      } else {
        if(t2 >= t3) {
          p2 -= 1;
        } else {
          p3 -= 1;
        }
      }
    }
  }
}