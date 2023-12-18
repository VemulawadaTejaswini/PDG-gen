import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		long a = Long.parseLong(strlist[0]);
		long b = Long.parseLong(strlist[1]);
		long c = Long.parseLong(strlist[2]);
		long[] abc = {a, b, c};
		Arrays.sort(abc);

		if(a%2==0 || b%2==0 || c%2==0){
			System.out.println(0);
		}else{
			Long long1 = abc[0];
			Long long2 = abc[1];
			BigInteger big1 = new BigInteger(long1.toString());
			BigInteger big2 = new BigInteger(long2.toString());
			System.out.println(big1.multiply(big2));
		}
	}
}
