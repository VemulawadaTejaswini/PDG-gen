import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		long a = Long.valueOf(strArr[0]);
		long b = Long.valueOf(strArr[1]);
		System.out.println(gcd(a, b));
 	}
	
	private static long gcd(long a, long b){
		long r = a % b;
		if(r == 0)
			return b;
		else
			return gcd(b, a % b);
	}
}