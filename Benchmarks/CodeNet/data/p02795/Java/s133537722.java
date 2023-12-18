import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		double h = Double.parseDouble(str);
		str = input.readLine( );
		double w = Double.parseDouble(str);
		str = input.readLine( );
		double n = Double.parseDouble(str);
		double ans = n / Math.max(h, w);

		System.out.println((int)Math.ceil(ans));
	}

}
