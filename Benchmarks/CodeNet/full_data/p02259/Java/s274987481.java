import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int b = 1;
    int count = 0;
    boolean sort = true;
    while(true) {
      sort = false;
      for(int i = n - 1; i > b - 1; i--) {
        if(a[i] < a[i - 1]) {
          int v = a[i];
          a[i] = a[i - 1];
          a[i - 1] = v;
          sort = true;
          count++;
        }
      }
      b++;
    }
    for(int i = 0; i < n; i++) {
      if(i == n - 1) {
        System.out.println(a[i]);
      } else {
        Sytem.out.print(a[i] + " ");
      }
    }
    System.out.println(count);
  }
}

