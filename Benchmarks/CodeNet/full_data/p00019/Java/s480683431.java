import java.util.*;
import java.math.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		while(scan.hasNext()){
			int n = scan.nextInt();
			BigInteger b = BigInteger.valueOf(1);
			for(int i = n; i > 0; i--){
				b = b.multiply(BigInteger.valueOf(i));
			}
			System.out.printf("%s\n", b.toString());
		}
	}
}