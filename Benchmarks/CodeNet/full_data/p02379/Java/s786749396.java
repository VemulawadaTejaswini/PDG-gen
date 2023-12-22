import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		double x1 = Integer.parseInt(input[0]);
		double y1 = Integer.parseInt(input[1]);
		double x2 = Integer.parseInt(input[2]);
		double y2 = Integer.parseInt(input[3]);

		double a = Math.pow(Math.abs(x1-x2), 2);
		double b = Math.pow(Math.abs(y1-y2), 2);

		System.out.println(Math.sqrt(a+b));
	}
}