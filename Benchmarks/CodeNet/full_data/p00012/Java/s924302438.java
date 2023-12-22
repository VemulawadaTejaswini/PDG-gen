import java.util.Scanner;

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

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      double [][] point = new double[4][2];
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 2; j++) {
          point[i][j] = sc.nextDouble();
        }
      }
      double[][] mat = {{point[1][0]-point[0][0],point[2][0]-point[0][0],point[3][0]-point[0][0]}
                       ,{point[1][1]-point[0][1],point[2][1]-point[0][1],point[3][1]-point[0][1]}};
      mat = solEq(mat);
      if(mat[0][2] >= 0 && mat[1][2] >= 0 && mat[0][2]+mat[0][2] <= 1 ) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}