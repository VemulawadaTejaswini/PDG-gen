import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long A = input.nextInt();
		long B = input.nextInt();
		long limit = Math.min(A,B);
		long ans = 0;
		for (long i = 2; i <= Math.sqrt(limit); i++) {
			if (A%i==0&&B%i==0) ans++;
			while (A%i==0&&B%i==0) {
				A/=i;
				B/=i;
			}
		}
		if (A>1&&B>1&&Math.max(A, B)%Math.min(A, B)==0) ans++;
		ans++; //Including 1
		System.out.println(ans);
	}
}