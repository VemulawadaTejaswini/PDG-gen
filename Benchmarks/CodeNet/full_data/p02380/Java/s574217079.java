import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] triangleNum = br.readLine().split(" ");

		int a = Integer.parseInt(triangleNum[0]);
		int b = Integer.parseInt(triangleNum[1]);
		int C = Integer.parseInt(triangleNum[2]);

		double S = 0.5 * a * b * Math.sin(Math.toRadians(C));
		double L = a + b + Math.sqrt((a * a) + (b * b) - (2 * a * b * Math.cos(Math.toRadians(C))));
		double h = (2 * S) / a;

		System.out.printf("%.8f\n", S);
		System.out.printf("%.8f\n", L);
		System.out.printf("%.8f\n", h);
	}
}