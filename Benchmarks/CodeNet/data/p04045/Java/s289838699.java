import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] d = new int[10];
    for(int i = 0; i < k; i++) {
      int c = sc.nextInt();
      d[c] = 1;
    }
    int ans = 0;
    for(int i = n; i < 1000000; i++) {
      int p = 0;
      int s = i;
      while(s > 0) {
        if(d[s % 10] == 1) p++;
        s /= 10;
      }
      if(p == 0) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}
