import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		long B = input.nextLong();
		long limit = Math.min(A,B);
		long ans = 0;
		for (long i = 2; i <= Math.sqrt(limit); i++) {
			if (A%i==0&&B%i==0) ans++;
			while (A%i==0&&B%i==0) {
				A/=i;
				B/=i;
			}
		}
		if (GCD(A,B)>1) ans++; //Breaking case: 111 74
		ans++; //Including 1
		System.out.println(ans);
	}
	public static long GCD(long A, long B) {
		if (A==0||B==0) return Math.max(A, B);
		return GCD(Math.max(A, B)%Math.min(A, B),Math.min(A, B));
	}
}