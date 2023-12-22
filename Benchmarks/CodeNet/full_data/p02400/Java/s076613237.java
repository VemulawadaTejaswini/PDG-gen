import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(br.readLine());

		double circle = r * 2 * Math.PI;
		double area = r * r * Math.PI;

		System.out.printf("%.6f",area);
		System.out.printf(" " + "%.6f",circle);
	}
}