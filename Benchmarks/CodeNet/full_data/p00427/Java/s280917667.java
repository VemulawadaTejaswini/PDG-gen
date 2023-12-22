import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			boolean m = line[2].equals("1");
			int r = Integer.parseInt(line[3]);

			if(n==0){break;}



			BigInteger numerator = BigInteger.ONE;
			BigInteger denominator = new BigInteger(String.valueOf(n));
			BigInteger mod = BigInteger.TEN;

			if(m){
				BigInteger denomiratio = BigInteger.ONE;
				for(int i=1; i<n; i++){
					numerator = numerator.multiply(BigInteger.valueOf(i)).add(denomiratio);
					denomiratio = denomiratio.multiply(BigInteger.valueOf(i));
				}
				denominator = denominator.multiply(denomiratio);
			}
			System.gc();

			BigInteger devided = numerator.divide(denominator);
			numerator = numerator.subtract(devided.multiply(denominator)).multiply(mod);

			System.out.print(devided.toString()+".");

			for (int i=0; i<r; i++){
				devided = numerator.divide(denominator);
				numerator = numerator.subtract(devided.multiply(denominator)).multiply(mod);
				System.out.print(devided.toString());
			}
			System.out.println();
		}
	}
}