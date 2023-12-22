import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];

    for (int i=0; i<n; i++){
      a[i] = scanner.nextInt();
    }
    for (int i=0; i<m; i++){
      b[i] = scanner.nextInt();
    }

    int ans = 0;

    ans = calc(a, b, k, 0,0, 0, 0);
    
    System.out.println(ans);
    
    scanner.close();
    return;
  }
  public static int calc(int[] a, int[] b, int k, int a_i, int b_i,  int ans, int sum){
    // System.out.println(a_i +","+ b_i);
    int tmp = -1;
    if(sum<=k){
      if(a_i < a.length && sum +a[a_i] <= k){
          tmp = Math.max(tmp, calc(a,b,k,a_i+1,b_i,a_i+b_i+1,sum+a[a_i]));
        }
      if(b_i < b.length && sum +b[b_i] <= k){
          tmp = Math.max(tmp, calc(a,b,k,a_i,b_i+1,a_i+b_i+1,sum+b[b_i]));
      }
    }
    
    return Math.max(ans,tmp);

  }
}
