import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		int num;
		BigInteger bd1;
		BigInteger bd2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());
			while (--num >= 0) {
				bd1 = new BigInteger(br.readLine());
				bd2 = new BigInteger(br.readLine());
				if (bd1.toString().length() > 80 || bd2.toString().length() > 80) {
					System.out.println("overflow");
				}
				bd1 = bd1.add(bd2);
				System.out.println((bd1.toString().length() > 80)? "overflow" : bd1.toString());
			}
		}
		catch (Exception e) {}
	}
}