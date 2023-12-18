import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	static long min(long a,long b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner cin = new Scanner(System.in);
		long q,h,f,s;
		q = cin.nextLong();
		h = cin.nextLong();
		f = cin.nextLong();
		s = cin.nextLong();
		long n = cin.nextLong();
		long v1 = min(min(q*4,h*2),f);
		if(n%2==0) {
			System.out.println(min(n*v1,s*(n/2)));
		}
		else {
			System.out.println(min(n*v1,(s*(n/2))+v1));
		}
	}
}