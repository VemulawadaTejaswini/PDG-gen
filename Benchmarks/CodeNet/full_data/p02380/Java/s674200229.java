import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strAry = br.readLine().split(" ");
		double a = Double.parseDouble(strAry[0]);
		double b = Double.parseDouble(strAry[1]);
		double c = Double.parseDouble(strAry[2]);
		System.out.println(a * (b * Math.sin(Math.toRadians(c))) / 2);
		System.out.println(a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(Math.toRadians(c)))));
		System.out.println(b * Math.sin(Math.toRadians(c)));
	}
}