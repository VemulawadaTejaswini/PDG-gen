  import java.util.*;

  class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      /*int[][] a = new int[n+2][m+2];
      for(int i = 0; i <= n+1; i++)Arrays.fill(a[i],0);
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= m; j++){
          a[i-1][j-1] = revers(a[i-1][j-1]);
          a[i-1][j] = revers(a[i-1][j]);
          a[i][j-1] = revers(a[i][j-1]);
          a[i-1][j+1] = revers(a[i-1][j+1]);
          a[i][j] = revers(a[i][j]);
          a[i][j+1] = revers(a[i][j+1]);
          a[i+1][j-1] = revers(a[i+1][j-1]);
          a[i+1][j] = revers(a[i+1][j]);
          a[i+1][j+1] = revers(a[i+1][j+1]);
        }
      }
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= m; j++){
          System.out.print(a[i][j]);
        }
        System.out.println();
      }
    }

    static int revers(int i){
      return 1-i;
    }*/
    if(m==1&&n==1)System.out.print(1);
    else if(m==2||n==2)System.out.print(0);
    else System.out.print((long)(n==1?1:n-2)*(m==1?1:m-2));
  }
}
