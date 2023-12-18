import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());

      int[] L = new int[m];
      int[] R = new int[m];

      for(int i=0;i<m;i++){
        L[i] = Integer.parseInt(sc.next());
        R[i] = Integer.parseInt(sc.next());
      }

      //int[][] card = new int[m+1][n];
      int[] card = new int[n];

      for(int j=0;j<n;j++){
        card[j] = 1;
      }

    for(int i=0;i<m;i++){
//////////////////////////////////////////////////////////
      for(int j=0;j<n;j++){
        if(L[i]-1<=j && j<R[i]){
          card[j] &= 1;
        }
        else{
          card[j] &= 0;
        }
      }
//////////////////////////////////////////////////////////
    }


      ////////////////////////////////////////////////////
      /*      for(int i=0;i<m+1;i++){
              for(int j=0;j<n;j++){
                System.out.print(card[i][j]+" ");
              }
              System.out.println("");
            }
      */
      ////////////////////////////////////////////////////

      int ans = 0;

      for(int j=0;j<n;j++){
        ans += card[j];
      }


      System.out.println(ans);

    }
}
