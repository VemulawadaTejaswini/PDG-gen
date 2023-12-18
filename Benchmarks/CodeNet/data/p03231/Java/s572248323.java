import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		String[] tmpArray = input.split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);

		String s = br.readLine();
		String t = br.readLine();

		if(s.charAt(0) != t.charAt(0)){
			System.out.println(-1);
			return;
		}

		long l = lcm(n, m);
		
		if(l != n && l != m){
			System.out.println(l);
		}
		else {
			if(n > m){
				String tmpS = s;
				s = t;
				t = tmpS;
				
				n = s.length();
				m = t.length();
			}
			
			for(int i = 0; i < n; i++){
				if(s.charAt(i) != t.charAt(i*(m/n))){
					System.out.println(-1);
					return;
				}
			}
			
			System.out.println(l);
		}
	}

	static int gcd(int a, int b){
		int tmp;

		while (a % b != 0)
		{
			tmp = b;
			b = a % b;
			a = tmp;
		}
		return b;
	}

	static long lcm(int a, int b, int gcd){
		return a*(b/gcd);
	}

	static long lcm(int a, int b){
		int g = gcd(a, b);

		return lcm(a,b,g);
	}

}
