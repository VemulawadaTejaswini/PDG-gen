public class Main {
	
	private static void daxpy(double a, double[] x, double[]y ) {
		for (int i = 0; i < x.length; ++i) {
			y[i] = a * x[i] + y[i];
		}
	}
	
	private static double dasum(double[] x) {
		double res = 0.;
		for (int i = 0; i < x.length; ++i) {
			res += Math.abs(x[i]);
		}
		return (res);
	}
	
	private static double dnrm2(double[] x) {
		double res = 0.;
		double scl = 1.;
		for (int i = 0; i < x.length; ++i) {
			final double abs = Math.abs(x[i]);
			if ( scl < abs ) {
				res = 1. + res * (scl / abs) * (scl / abs);
				scl = abs;
			} else {
				res += (abs / scl) * (abs / scl);
			}
		}
		return (scl * Math.sqrt(res));
	}

	private static int idamax(double[] x) {
		double max = Math.abs(x[0]);
		int res = 0;
		for (int i = 1; i < x.length; ++i) {
			if (max < Math.abs(x[i])) {
				max = Math.abs(x[i]);
				res = i;
			}
		}
		return (res);
	}
	
	private static double calcL3Norm(double[] x) {
		double res = 0.;
		for (int i = 0; i < x.length; ++i) {
			res += Math.pow(Math.abs(x[i]), 3);
		}
		return Math.pow(res, 1./3.);
	}
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		final double[] x = new double[sc.nextInt()];
		final double[] y = new double[x.length];

		for (int i = 0; i < x.length; ++i) {
			x[i] = sc.nextDouble();
		}
		for (int i = 0; i < x.length; ++i) {
			y[i] = sc.nextDouble();
		}
		daxpy(-1., y, x);

		out.printf("%.6f\n", dasum(x));
		out.printf("%.6f\n", dnrm2(x));
		out.printf("%.6f\n", calcL3Norm(x));
		out.printf("%.6f\n", Math.abs(x[idamax(x)]));
		
		sc.close();
	}
	
	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}