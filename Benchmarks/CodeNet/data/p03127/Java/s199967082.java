import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //WOOOOOOO AtCoder is HELPING!!!!!!!!!!
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long curGCD = input.nextLong();
		for (int i = 1; i < N; i++) {
			long prev = curGCD;
			long x = input.nextLong();
			curGCD = GCD(prev,x);
		}
		System.out.println(curGCD);
	}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.max(a, b)%Math.min(a, b),Math.min(a, b));
	}
}