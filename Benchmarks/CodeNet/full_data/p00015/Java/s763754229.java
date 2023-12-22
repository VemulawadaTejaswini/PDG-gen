import java.math.BigInteger;
import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			BigInteger a=sc.nextBigInteger();
			BigInteger b=sc.nextBigInteger();
			if(a.add(b).compareTo(new BigInteger ("99999999999999999999999999999999999999999999999999999999999999999999999999999999"))==1)System.out.println("overflow");
			else System.out.println(a.add(b));
		}
	}
	}




