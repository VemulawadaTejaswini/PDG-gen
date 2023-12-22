import java.io.*;
import java.util.*;
class Main{
  static int n;
  static int m[][];
  static int p[];
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    String s[] = new String[2];
    m = new int[n+1][n+1];
    p = new int[n+1];
    for(int i = 0; i<n; i++){
      s = br.readLine().split("\\s+");
      p[i] = Integer.parseInt(s[0]);
      p[i+1] = Integer.parseInt(s[1]);

    }
    System.out.println(matrixChainOrder());
  }
  static int matrixChainOrder(){
    int q;
    int j;
    for(int i = 1; i<=n; i++){
      m[i][i] = 0;
    }
    for(int l =1; l<n; l++){
      for(int i = 1; i<=n-l; i++){
        j = i+l;
        m[i][j]= (int)Double.POSITIVE_INFINITY;
        for(int k = i; k<j; k++){
          q = m[i][k] + m[k+1][j] + p[i-1] *p[k] *p[j];
          m[i][j] = Math.min(m[i][j],q);
        }
      }
    }
    return m[1][n];
  }
}
