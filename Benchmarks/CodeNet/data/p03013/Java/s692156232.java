import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int m = sc.nextInt();
        int a[] = new int[m];
        int dp[] = new int[n];
        Arrays.fill(dp,2);
        dp[0] = 1;
        for(int i=0; i<m; i++){
          a[i] = sc.nextInt();
          int num = a[i] - 1;
          dp[num] = 1;
          dp[num+1] = 1;
          if(a[i] < n-1) dp[num+2] = 1;
        }
        dp[n-1] = 2;
        Arrays.sort(a);
        for(int i=1; i<m; i++){
          if(a[i-1] == a[i]-1){
            System.out.println(0);
            return;
          }
        }
        int cnt = 0;
        long anss = 1;
        for(int i=0; i<n; i++){
          if(dp[i] == 2) cnt++;
          if(dp[i] == 1){
            int p = (int)pow(2,cnt);
            anss *= p;
            cnt = 0;
          }
        }
        System.out.println(anss %= 1000000007 *2);
    }
}
