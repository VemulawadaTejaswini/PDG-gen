import java.io.*;
//import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    //double fval = 0.0, lval;
    //koch(n, 
    ans(0.0, 0.0);
    koch(n, 0.0, 0.0, 100.0, 0.0);
    ans(100.0, 0.0);
  }
  static void koch(int n, double p1x, double p1y, double p2x, double p2y){
    if(n == 0) return;
    double sx = (2 * p1x + p2x) / 3;
    double sy = (2 * p1y + p2y) / 3;
    double tx = (p1x + 2 * p2x) / 3;
    double ty = (p1y + 2 * p2y) / 3;

    double ux = (tx - sx) * Math.cos(60 * (Math.PI / 180)) - (ty - sy) * Math.sin(60 * (Math.PI / 180)) + sx;
    double uy = (tx - sx) * Math.sin(60 * (Math.PI / 180)) + (ty - sy) * Math.cos(60 * (Math.PI / 180)) + sy;

    koch(n - 1, p1x, p1y, sx, sy);
    ans(sx, sy);

    koch(n - 1, sx, sy, ux, uy);
    ans(ux, uy);

    koch(n - 1, ux, uy, tx, ty);
    ans(tx, ty);

    koch(n - 1, tx, ty, p2x, p2y);
  }
  static void ans(double x, double y){
    System.out.println(x+" "+y);
  }
}

