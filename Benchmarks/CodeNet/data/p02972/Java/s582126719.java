import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N=sc.nextInt();

      int n=N+1;

      int[] a = new int[n];

      for(int i=1;i<n;i++){
        a[i]=sc.nextInt();
      }

      int[] ans = new int[n];

      int sum1=0;

      for(int i=n-1;i>=1;i--){
      //////////////////////////////////////////////////////
      if(n/2<=i){
          ans[i] = a[i];
        }
        else{

          for(int j=2*i;j<n;j+=i){ //there is 2*i, and 2*i<=N<n
            sum1 = sum1 + ans[j];
          }
          //////////////////////////////////////////
          if(sum1%2==a[i]){
            ans[i] = 0;
          }
          else{
            ans[i] = 1;
          }
          /////////////////////////////////////////
        }
        sum1=0;
      /////////////////////////////////////////////////////
      }

    ////////////////////////////////////////
      int m=0;
      for(int i=1;i<n;i++){
        m = m + ans[i];
      }

      System.out.println(m);

      for(int i=1;i<n;i++){
        if(ans[i]==1){
          System.out.print(i+" ");
        }
      }
    /////////////////////////////////////////

    }
}
