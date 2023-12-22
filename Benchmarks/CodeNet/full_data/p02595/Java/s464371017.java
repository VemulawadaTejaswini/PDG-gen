import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer pointN = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
		Integer distanceD = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
		int count = 0;
		for(int i = 0; i < pointN; i++) {
			Integer X = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
			Integer Y = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

			double result = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));

			if(result > distanceD) count++;
		}
		System.out.println(count);
	}
}