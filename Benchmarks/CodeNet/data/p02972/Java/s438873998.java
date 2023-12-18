import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n+1];
      for(int i = 1; i <= n; i++)
        arr[i] = sc.nextInt();

      int[] res = new int[n+1];

      int m = 0;
      for(int i = n; i >= 1; i--) {
        int cnt = cntSum(res, i);
        if(cnt % 2 != arr[i]) {
          m++;
          res[i] = 1;
        }
      }
      
      System.out.println(m);
      
      StringBuilder sb = new StringBuilder();
      for(int i = 1; i <= n; i++) {
        if(res[i] == 0) continue;
        sb.append(i + " ");
      }
      if(sb.length() > 0)
        System.out.println(sb.toString().substring(0, sb.length() - 1));
  }

  private static int cntSum(int[] res, int n) {
    int sum = 0;
    for(int i = n * 2; i < res.length; i += n)
      sum += res[i];
    return sum;
  }
}