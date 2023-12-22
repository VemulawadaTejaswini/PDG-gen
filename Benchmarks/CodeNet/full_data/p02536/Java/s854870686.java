import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int cnt = 0;
    
    int[] ab = new int[n+1];
    
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(ab[a] == 0 || ab[b] == 0) {
        ab[a] = 1;
        ab[b] = 1;
      } else {
        cnt++;
      }
    }
    int r = n-1-m+cnt < 0 ? 0:n-1-m+cnt;
    System.out.println(r);
  }
}