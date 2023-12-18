import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

//////////////////////////////////////////////////////
      int n = sc.nextInt();
      int q = sc.nextInt();

      int[][] A = new int[n-1][2];

      for(int i=0;i<n-1;i++){
        A[i][0]=sc.nextInt();
        A[i][1]=sc.nextInt();
      }

      Arrays.sort(A, (a, b)->a[0]-b[0]);

      //int[] p = new int[q];
      //int[] x = new int[q];

      long[] ans = new long[n+1];

      for(int i=0;i<q;i++){
        ans[sc.nextInt()] += sc.nextInt();
      }

      for(int i=0;i<n-1;i++){
        ans[A[i][1]] += ans[A[i][0]];
      }
      for(int i=1;i<n+1;i++){
        System.out.print(ans[i]+" ");
      }

/*
      System.out.print(ans[1]+" ");
      for(int i=2;i<n+1;i++){
        for(int j=0;j<n-1;j++){

          if(b[j]==i){
            ans[i] += ans[a[j]];
            break;
          }

        }
        System.out.print(ans[i]+" ");
      }
*/

//////////////////////////////////////////////////////


    }

}
