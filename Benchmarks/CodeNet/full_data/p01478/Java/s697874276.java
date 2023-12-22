//aoj2361
public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[][] c;
    int i, j, k, l, max, tmp;

    n = sc.nextInt();
    c = new int[n][n];

    max = 0;
    for(i = 0;i < n;i++){
      for(j = 0;j < n;j++){
        c[i][j] = sc.nextInt();
        if(max < c[i][j])max = c[i][j];
      }
    }

//O(100000 * 28 * 14)
    for(k = max;k!=0;k--){
      for(i = 0;i < (n - 1);i++){
        for(j = (i + 1);j < n;j++){
          if(k == c[i][j]){
            for(l = 0;l < n;l++){
              tmp = c[i][l] + c[l][j] + c[i][l];
              if(c[i][j] > tmp){
                c[i][j] = tmp;
                c[j][i] = tmp;
              }
            }
          }
        }
      }
    }

    max = 0;
    for(i = 0;i < n;i++){
      for(j = 0;j < n;j++){
        if(max < c[i][j])max = c[i][j];
      }
    }

    System.out.println(max);
    
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}