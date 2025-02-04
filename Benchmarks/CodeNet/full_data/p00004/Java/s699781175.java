import java.util.Scanner;
import java.math.BigDecimal;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 2, m = 3;
    double a[][] = new double[n][m];
    while(sc.hasNext()) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          a[i][j] = sc.nextDouble();
        }
      }
      for (int ipv = 0; ipv < n; ipv++) {
        double max = 0.0;
        int row = 0;
        for(int i = ipv; i < n; i++) {
          if(Math.abs(a[i][ipv]) > max) {
            max = a[i][ipv];
            row = i;
          }
        }
        if(max == 0.0) {
          break;
        }
        if(ipv != row) {
          for(int j = 0; j < m; j++) {
            double temp = a[ipv][j];
            a[ipv][j] = a[row][j];
            a[row][j] = temp;
          }
        }
        
        double inv_pv = 1.0/a[ipv][ipv];
        for (int j = 0; j < m; j++) {
          a[ipv][j] *= inv_pv;
        }
        
        for (int i = 0; i < n; i++) {
          if (i != ipv) {
            double temp = a[i][ipv];
            for (int j = 0; j < m; j++) {
              a[i][j] -= temp*a[ipv][j];
            }
          }
        }
      }
      BigDecimal x[] = new BigDecimal[n];
      for (int i = 0; i < n; i++) {
        BigDecimal bda = new BigDecimal(a[i][m-1]);
        x[i] = bda.setScale(3, BigDecimal.ROUND_HALF_UP);
      }
      System.out.println(x[0]+" "+x[1]);
    }
  }
}