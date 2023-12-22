import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  double[] x = new double[3];
  double[] y = new double[3];
  while (in.hasNext()) {
	{
	  for (int i = 0; i < 3; i++) {
		x[i] = in.nextDouble();
		y[i] = in.nextDouble();
	  }
	  double px = in.nextDouble();
	  double py = in.nextDouble();
	  for (int i = 0; i < 3; i++) {
		x[i] -= px;
		y[i] -= py;
	  }
	}
	double[] AB = f(x, y);
	if (AB[0] >= 0 && AB[1] >= 0) {
	  System.out.println("YES");
	} else {
	  System.out.println("NO");
	}
  }
}

private static double[] f(double[] x, double[] y) {
  x[0] = -x[0];
  y[0] = -y[0];
  double D = x[1] * y[1] - x[2] * x[0];
  double xx = +y[1] * y[2] - x[2] * y[0];
  double yy = +x[1] * y[0] - x[0] * y[2];
  return new double[] { (xx / D), (yy / D) };
}
}