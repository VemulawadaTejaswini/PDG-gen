import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		String s = in.readLine();
		long n = Long.parseLong(s);
		
		long max = addNumbers(n);
		
		long tmp = n;
		long tmp2;
		while(tmp > n/10) {
			tmp2 = addNumbers(tmp);
			if(tmp2 > max) max = tmp2;
			tmp--;
		}
		System.out.println(max);
	}

	private static int addNumbers(long n) {
		String s = "" +n;
		char[] c = s.toCharArray();
		int sum = 0;
		for(int i = 0; i < c.length; i++) {
			sum += Character.getNumericValue(c[i]);
		}
		return sum;
	}
	

}