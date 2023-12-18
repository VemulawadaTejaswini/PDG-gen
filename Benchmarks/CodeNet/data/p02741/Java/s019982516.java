

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		
		long a = Long.parseLong(as[0]);
		long b = Long.parseLong(as[1]);
		long c = Long.parseLong(as[2]);
//		double ad = Math.sqrt(a);
//		double ab = Math.sqrt(b);
//		double ac = Math.sqrt(c);
		if(a > 1000000000 || b > 1000000000 || c > 1000000000) {
			System.out.println("No");
		}else {
		
		if(a*b*4 < (c -a -b)*(c-a-b)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		}
	}

}
