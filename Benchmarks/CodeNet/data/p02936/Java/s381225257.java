import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

//////////////////////////////////////////////////////
      int n = sc.nextInt();
      int q = sc.nextInt();

      int[] a = new int[n-1];
      int[] b = new int[n-1];

      for(int i=0;i<n-1;i++){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
      }

      //int[] p = new int[q];
      //int[] x = new int[q];

      long[] ans = new long[n+1];

      for(int i=0;i<q;i++){
        ans[sc.nextInt()] += sc.nextInt();
      }


      for(int i=1;i<n+1;i++){
        for(int j=0;j<n-1;j++){
          if(b[j]==i && a[j]<b[j]){
            ans[i] += ans[a[j]];
            break;
          }
        }
        System.out.print (ans[i]+" ");
      }


//////////////////////////////////////////////////////


    }

}
