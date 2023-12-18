import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    int max = 0;
    int min = (int)Math.pow(10, 9) + 1;
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      max = Math.max(max, a[i]);
      min = Math.min(min, a[i]);
    }
    Arrays.sort(a);
    int[] b = new int[N];
    for(int i = 1; i < N; i++) {
      if(a[i] > a[i - 1]) min = Math.min(a[i] - a[i - 1], min);
      b[i] = a[i] - a[i - 1];
    }
    String ans = "IMPOSSIBLE";
    if(K == max) ans = "POSSIBLE";
    if(K < max) {
      boolean flg = false;
      if(min == 1) flg = true;
      for(int i = 0; i < N; i++) {
        if(a[i] % min != 0) flg = true;
        if(b[i] % min != 0) flg = true;
      }
      if(flg) ans = "POSSIBLE";
    }
    System.out.println(ans);
  }
}