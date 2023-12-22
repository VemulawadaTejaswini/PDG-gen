import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    boolean sort = true;
    int v;
    int count = 0;
    while(sort) {
      sort = false;
      for(int i = n - 1; i > 0; i--) {
        if(a[i - 1] > a[i]) {
          v = a[i - 1];
          a[i - 1] = a[i];
          a[i] = v;
          sort = true;
          count++;
        }
      }
    }
    for(int i = 0; i < n; i++) {
      if(i == n - 1) {
        System.out.println(a[i]);
      } else {
        System.out.print(a[i] + " ");
      }
    }
    System.out.println(count);
  }
}

