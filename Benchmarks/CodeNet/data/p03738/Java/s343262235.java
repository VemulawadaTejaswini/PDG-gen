import java.math.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		BigInteger a,b,c;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			a = cin.nextBigInteger();
			b = cin.nextBigInteger();
			c = a.max(b);
			if(a.equals(c)) 
				System.out.println("GREATER");
			else 
				System.out.println("LESS");
		}
		cin.close();
	}

}
