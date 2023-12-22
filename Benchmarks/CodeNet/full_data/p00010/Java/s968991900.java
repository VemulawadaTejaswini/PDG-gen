import java.util.Scanner;
import java.math.BigDecimal;

class Main{
  public static double[][] solEq(double[][] a){
    int n = a.length, m = a[0].length;
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
    return a;
  }


  public static double[] per_bisec(double A[], double B[]){
    double[] vecAB = {B[0]-A[0], B[1]-A[1]};
    double[] M = {(B[0]+A[0])*0.5, (B[1]+A[1])*0.5};
    double[] equ = {vecAB[0], vecAB[1], vecAB[0]*M[0]+vecAB[1]*M[1]};
    return equ;
  }
  public static double roundOff(double x, int n){
      BigDecimal bdx = new BigDecimal(x);
      bdx = bdx.setScale(n, BigDecimal.ROUND_HALF_UP);
      x = bdx.doubleValue();
      return x;
      }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      double [][] point = new double[3][2];
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 2; k++) {
          point[j][k] = sc.nextDouble();
        }
      }
      double[][] mat = {per_bisec(point[0],point[1]),per_bisec(point[0],point[2])};
      mat = solEq(mat);
      double x = mat[0][2];
      double y = mat[1][2];
      double r = Math.sqrt(Math.pow((mat[0][2]-point[0][0]),2)+Math.pow((mat[1][2]-point[0][1]),2));
      x = roundOff(x,3);
      y = roundOff(y,3);
      r = roundOff(r,3);
      System.out.printf("%.3f %.3f %.3f", x, y, r);
    }
  }
}