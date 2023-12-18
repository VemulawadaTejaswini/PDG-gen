import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      long k = sc.nextLong();

      double s = Math.pow(10,9);

      int x = (int)s + 7;

      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }

      int cnt1 = 0;
      int cnt2 = 0;
      int cnt = 0;
      long ans = 0;
      long aaa = 0;


      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(a[i]>a[j]){
            cnt1++;
          }
        }
        for(int j=i-1;j>=0;j--){
          if(a[i]>a[j]){
            cnt2++;
          }
        }
        cnt = cnt1 + cnt2;
        aaa = (cnt * k*(k-1)/2) % x;
        ans = (ans + k*cnt1 + aaa) % x;
        cnt1 = 0;
        cnt2 = 0;
        cnt = 0;
        aaa = 0;
      }





      System.out.println(ans);
    }
}
