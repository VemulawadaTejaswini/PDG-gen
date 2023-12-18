import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    int t = 0;
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      if(i > 0) {
        if((2 * sum) < a[i]) t = i; 
      }
      sum += a[i];
    }
    System.out.println(n - t);
  }
}