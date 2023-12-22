import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] values = x.split(" ");
		long a = Integer.parseInt(values[0]);
		long b = Integer.parseInt(values[1]);

		String ans = String.format("%f", ((double)a / b));
		System.out.println((a / b) + " " + (a % b) + " " + ans);
	}
}