import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int a,b;


		while((str=br.readLine()) != null){
			a = Integer.parseInt(str.substring(0, str.indexOf(" ")));
			b = Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()));

			System.out.println(gcd(a, b) + " " + lcm(a,b));

		}
	}

	static int gcd(int a,int b){
		return b == 0 ? a : gcd(b,a%b);
	}

	static int lcm(int a, int b){
		return b*a/gcd(a,b);
	}
}