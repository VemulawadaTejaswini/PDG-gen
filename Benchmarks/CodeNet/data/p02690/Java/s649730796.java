import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		long X = input.nextLong();
		long[] ans = SOLVE(X);
		System.out.println(ans[0]+" "+ans[1]);
	}
	public static long[] SOLVE(long X) {
		long[] ans = new long[2];
		for (long A = 0;;A++) {
			long START = (long)(Math.pow(A,5));
			long diff = START-X;
			for (int B = 0;;B++) {
				if (Math.pow(B, 5)==Math.abs(diff)) {
					if (diff<0) {
						ans[0]=A;
						ans[1]=-B;
					} 
					else {
						ans[0]=A;
						ans[1]=B;
					}
					return ans;
				}
				if (Math.pow(B, 5)>Math.abs(diff)) break;
			}
		}
	}
}