import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String inputData = br.readLine();
		String[] inputValue = inputData.split(" ");

		int a = Integer.parseInt(inputValue[0]);
		int b = Integer.parseInt(inputValue[1]);

		double conversion_a = a;
		double conversion_b = b;

		int d = a/b;
		int r = a%b;
		double f = conversion_a/conversion_b;

		System.out.printf(d + " " + r + " " + "%.5f", f);
	}

}