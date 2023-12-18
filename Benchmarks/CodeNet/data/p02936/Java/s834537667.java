import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

//////////////////////////////////////////////////////
      int n = sc.nextInt();
      int q = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      for(int i=1;i<n;i++){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
      }
      int[] p = new int[q+1];
      int[] x = new int[q+1];
      for(int i=1;i<q+1;i++){
        p[i] = sc.nextInt();
        x[i] = sc.nextInt();
      }
//////////////////////////////////////////////////////

      long[] counter = new long[n+1];
      int[][] partTree = new int[n+1][n+1];
      int[] numNo0 = new int[n+1];

      for(int i=1;i<n+1;i++){
        partTree[i][1] = i;
        numNo0[i] = 1 + 1;
      }

      for(int i=1;i<n;i++){
        for(int j=1;j<n+1;j++){
          for(int k=1;k<numNo0[j];k++){
            if(partTree[j][k]==a[i]){
              partTree[j][numNo0[j]] = b[i];
              numNo0[j]++;
            }
          }
        }
      }
///////////////////////////////////////////////////////

      for(int i=1;i<q+1;i++){
        for(int j=1;j<numNo0[p[i]];j++){
          counter[partTree[p[i]][j]]+=x[i];
        }
      }


/*
    for(int i=1;i<n+1;i++){
      for(int j=1;j<n+1;j++){
        System.out.print(partTree[i][j]+" ");
      }
      System.out.println("");
    }
  */


    for(int i=1;i<n+1;i++){
      System.out.print(counter[i]+" ");
    }


    }
}
