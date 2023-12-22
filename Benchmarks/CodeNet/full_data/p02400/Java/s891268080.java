import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		double r = 0;
		double pi = Math.PI;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		r = Double.parseDouble(str);
		
		double equ = r * r * pi; 
		double loc = r * 2 * pi;
		
		String eAnswer = String.format("%.6f", equ);
		String lAnswer = String.format("%.6f", loc);
		
		System.out.println(eAnswer + " " + lAnswer);
	}
}