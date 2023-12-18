import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long n= in.nextLong();
		System.out.println(check(n) ? "Yes" : "No");
	}

	public static boolean check(long n) {
		long nn = n;
		long sum = 0;
		while(nn>0) {
			sum += nn % 10;
			nn /= 10;
		}

		return (n % sum) == 0;
	}

}