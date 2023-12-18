import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    long q = sc.nextLong();
    long[] p = new long[n];
    for(int i = 0; i < n; i++) {
      p[i] = k - q;
    }
    for(int i = 0; i < q; i++) {
      int a = sc.nextInt() - 1;
      p[a]++;
    }
    for(int i = 0; i < n; i++) {
      String ans = "Yes";
      if(p[i] <= 0) ans = "No";
      System.out.println(ans); 
    }
  }
}