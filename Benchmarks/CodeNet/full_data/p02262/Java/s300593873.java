import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int l = n / 9;
    int m;
    if(l >= 40) {
      m = 40;
    } else if(l >= 13) {
      m = 13;
    } else if(l >= 4) {
      m = 4;
    } else {
      m = 1;
    }
    System.out.println(m);
    for(int i = m; i > 0; i = (i - 1) / 3) {
      if(m == 1) {
        System.out.println(m);
      } else {
        System.out.print(m + " ");
      }
      for(int j = n - m; j < n; j++) {
        int v = a[j];
        int k = j - m;
        while(k >= 0 && a[k] > v) {
          a[j] = a[k];
          k -= m;
        }
        a[k + m] = v;
      }
    }
    for(int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}

