import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeSet;

public class Main{
  static final int INF = Integer.MAX_VALUE / 2;
  static int n;
  static int[] a;

  static final boolean DEBUG = false;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();

    a = new int[3 * n];
    for(int i = 0; i < 3 * n; i++){
      a[i] = sc.nextInt();
    }

    int[] b = new int[3 * n];
    for(int i = 0; i < 3 * n; i++){
      b[i] = a[3 * n - i - 1];
    }

    long[] dp1 = new long[3 * n + 1];
    int min = INF;
    TreeSet< Integer > s1 = new TreeSet< >();
    for(int i = 0; i < n; i++){
      min = Math.min(min, a[i]);
      dp1[n] += a[i];
      s1.add(a[i]);
    }
    for(int i = n + 1; i <= 3 * n; i++){
      s1.add(a[i - 1]);
      if(a[i - 1] > min){
        dp1[i] = dp1[i - 1] - min + a[i - 1];
        if(s1.higher(min) != null){
          min = s1.higher(min);
        }
      }
      else{
        dp1[i] = dp1[i - 1];
      }
    }

    long[] dp2 = new long[3 * n + 1];
    int max = 0;
    TreeSet< Integer > s2 = new TreeSet< >();
    for(int i = 0; i < n; i++){
      max = Math.max(max, b[i]);
      dp2[n] += b[i];
      s2.add(b[i]);
    }
    for(int i = n + 1; i <= 3 * n; i++){
      s2.add(b[i - 1]);
      if(b[i - 1] < max){
        dp2[i] = dp2[i - 1] - max + b[i - 1];
        if(s2.lower(max) != null){
          max = s2.lower(max);
        }
      }
      else{
        dp2[i] = dp2[i - 1];
      }
    }

    if(DEBUG){
      for(int i = n; i <= 3 * n; i++){
        System.out.println("dp1[" + i + "] = " + dp1[i]);
      }
      for(int i = n; i <= 3 * n; i++){
        System.out.println("dp2[" + i + "] = " + dp2[i]);
      }
    }

    long ans = Long.MIN_VALUE / 2;
    for(int i = n; i <= 2 * n; i++){
      ans = Math.max(ans, dp1[i] - dp2[3 * n - i]);
      if(DEBUG){
        System.out.println("i = " + i);
        System.out.println("3 * n - i = " + (3 * n - i));
        System.out.println(dp1[i] - dp2[3 * n - i]);
      }
    }

    System.out.println(ans);
  }
}
