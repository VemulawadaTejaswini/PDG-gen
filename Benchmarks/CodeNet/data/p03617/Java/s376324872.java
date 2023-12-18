import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

class Ideone
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
		long t1 = (q*4);
		t1 = min(t1,h*2);
		t1 = min(t1,f);
		if(n%2==1) {
			System.out.println(min(t1*n,(s*(n/2))+t1));
		}
		else {
			System.out.println(min(t1*n,(s*(n/2))));
		}
		cin.close();
	}
}