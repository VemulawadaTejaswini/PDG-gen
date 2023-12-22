import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		String[] x = buf.readLine().split(" ");
		String[] y = buf.readLine().split(" ");
		double manhattan = 0;
		double euclidean = 0;
		double chebyshev = 0;
		double minkowski_p3 = 0;
		for (int i = 0; i < x.length; i++) {
			manhattan += Math.abs(Integer.parseInt(x[i]) - Integer.parseInt(y[i]));
			euclidean += Math.pow(Integer.parseInt(x[i]) - Integer.parseInt(y[i]), 2);
			minkowski_p3 += (Math.pow(Math.abs(Integer.parseInt(x[i]) - Integer.parseInt(y[i])), 3));
			if (Math.abs(Integer.parseInt(x[i]) - Integer.parseInt(y[i])) > chebyshev) {
				chebyshev = Math.abs(Integer.parseInt(x[i]) - Integer.parseInt(y[i]));
			}
		}
		euclidean = Math.sqrt(euclidean);
		minkowski_p3 = Math.cbrt(minkowski_p3);
		String line_sep = System.getProperty("line.separator");
		System.out.println(manhattan + line_sep + euclidean + line_sep + minkowski_p3 + line_sep + chebyshev);
	}

}