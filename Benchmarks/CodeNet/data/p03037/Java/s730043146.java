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

      int[][] card = new int[m+1][n];

      for(int i=0;i<m;i++){
        for(int j=L[i]-1;j<R[i];j++){
          card[i][j] = 1;
        }
      }

      for(int j=0;j<n;j++){
        card[m][j] = 1;
      }

      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          card[m][j] = card[m][j] & card[i][j];
        }
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
        ans += card[m][j];
      }


      System.out.println(ans);

    }
}
