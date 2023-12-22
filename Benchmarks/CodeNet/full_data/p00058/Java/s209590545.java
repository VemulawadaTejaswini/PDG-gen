import java.io.*;
import java.util.StringTokenizer;

class Main {
  public static void main(String args[]) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String buf;
    try {
      while ((buf = br.readLine())!=null) {
        double x[] = new double[4];
        double y[] = new double[4];
        StringTokenizer st = new StringTokenizer(buf);
        for (int i=0;i<4;i++) {
          x[i] = Double.parseDouble(st.nextToken());
          y[i] = Double.parseDouble(st.nextToken());
        }
        double vx[] = new double[2];
        double vy[] = new double[2];
        vx[0] = x[1]-x[0];
        vy[0] = y[1]-y[0];
        vx[1] = x[3]-x[2];
        vy[1] = y[3]-y[2];
        double  dif = vx[0]*vx[1]+vy[0]*vy[1];
        if (Math.abs(Math.round(dif*Math.pow(100000,2)))==0) System.out.println("YES");
        else System.out.println("NO");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}