//package P1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BigInteger a,b;
		Scanner in=new Scanner(System.in);
		a=in.nextBigInteger();
		b=in.nextBigInteger();
		int c=a.compareTo(b);
		if (c<0) {
			System.out.println("LESS");
		}else if (c>0) {
			System.out.println("GREATER");
			System.out.println("Since "+a+">"+b+", print GREATER.");
		}else {
			System.out.println("EQUAL");
		}
	}

}
