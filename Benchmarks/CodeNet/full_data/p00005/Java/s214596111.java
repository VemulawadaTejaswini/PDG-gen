import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		while(input.hasNextInt()){
			int a,b;
			a=input.nextInt();
			b=input.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
	}
	static int gcd (int a, int b){
		if (b==0)
			return a;
		else
			return gcd(b, a%b);
	}
	static BigInteger lcm (int a,int b){
		BigInteger num1=BigInteger.valueOf(a);
		BigInteger num2=BigInteger.valueOf(b);
		return num1.multiply(num2).divide(BigInteger.valueOf(gcd(a,b)));
	}