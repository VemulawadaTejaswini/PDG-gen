import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String input = r.readLine();
		while(input != null){
			String s[] = input.split(" ");
			double a = Integer.parseInt(s[0]);
			double b = Integer.parseInt(s[1]);
			double c = Integer.parseInt(s[2]);
			double d = Integer.parseInt(s[3]);
			double e = Integer.parseInt(s[4]);
			double f = Integer.parseInt(s[5]);
			
			double y = (c*d-f*a)/(b*d-e*a);
			double x = (c*e-f*b)/(a*e-d*b);
			System.out.println(String.format("%.3f %.3f", x, y));
			
			input = r.readLine();
		}
	}
}