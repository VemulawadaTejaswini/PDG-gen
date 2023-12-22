import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			while ((x = in.readLine()) != null) {
				String[] ab = x.split(" ");
				int a = Integer.parseInt(ab[0]);
				int b = Integer.parseInt(ab[1]);
				
				if (a > b) {
					int tmp = a;
					a = b;
					b = tmp;
				}
				
				int tmp;
				int ta = a;
				int tb = b;
				while ((tmp = tb % ta) != 0) {
					tb = ta;
					ta = tmp;
				}
				
				long gcd = ta;
				long lcm = a * b / gcd;
				
				System.out.println(gcd + " " + lcm);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(x);
	}
}