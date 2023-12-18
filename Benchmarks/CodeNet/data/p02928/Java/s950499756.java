import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();

      double s = Math.pow(10,9);

      int x = (int)s + 7;

      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }

      int cnt1=0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(a[i]>a[j]){
            cnt1++;
          }
        }
      }
      long ans1 = (cnt1*k) % x;

      int cnt2=0;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(a[i]>a[j]){
            cnt2++;
          }
        }
      }
      long ans2 = (cnt2*k*(k-1)/2) % x;

      long ans = (ans1+ans2) % x;


      System.out.println(ans);
    }
}
