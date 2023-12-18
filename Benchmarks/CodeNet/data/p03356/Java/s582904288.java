import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] p = new int[n+1];
    for(int i=1;i<=n;i++)p[i]=sc.nextInt();
    int[] x = new int[m];
    int[] y = new int[m];
    int[][] path = new int[n+1][n+1];
    for(int i=0;i<m;i++){
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
      path[x[i]][y[i]]++;
      path[y[i]][x[i]]++;
    }
    int cnt = 0;
    for(int k=1;k<=n;k++)
      for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++){
          path[i][j]=Math.max(path[i][j],path[i][k]*path[k][j]);
        }
    for(int i=1;i<=n;i++)
      if(path[i][p[i]]>0)cnt++;
    System.out.println(cnt);
  }
}