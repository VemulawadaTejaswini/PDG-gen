import java.util.*;
public class Main{
  private static String a;
  static double xp,yp,z,x1,y1;
  public static double[] w(double[] x, double[] y) {
	  x[2] = -x[2];
	  y[2] = -y[2];
	  z = (x[0] * y[1] )- (x[1] * y[0]);
	  x1 = +(y[1] * x[2]) - (x[1] * y[2]);
	  y1 = +(x[0] * y[2]) - (y[0] * x[2]);
	  return new double[] { (x1 / z), (y1 / z) };
	}
public static void main(String [] args){
	  Scanner cs = new Scanner(System.in);
	  double[] x = new double[3];
	  double[] y = new double[3];
	  while (cs.hasNextDouble()) {  {
	      for (int i = 0; i < 3; i++) {
	        x[i] = cs.nextDouble();
	        y[i] = cs.nextDouble();
	      }
	       xp = cs.nextDouble();
	       yp = cs.nextDouble();
	      for (int i = 0; i < 3; i++) {
	        x[i] -= xp;
	        y[i] -= yp;
	      }
	    }
	    double[] X = w(x, y);
	    if (X[0] >= 0 && X[1] >= 0) System.out.println("Yes");
	   else System.out.println("No");
	    }
	  }
	
	}