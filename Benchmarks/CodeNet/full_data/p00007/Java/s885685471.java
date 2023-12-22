import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		double n = Double.parseDouble(str);
		double interest = 0.5;
		double m = 10000;

		System.out.println((int)(100000 + m * Math.round(n*interest)));

	}
}