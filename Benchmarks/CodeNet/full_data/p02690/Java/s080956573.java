import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		long X = input.nextLong();
		for (long A = 0;;A++) {
			long START = (long)(Math.pow(A,5));
			long diff = X-START;
			boolean found = false;
			for (int B = 0;;B++) {
				if (Math.pow(B, 5)==Math.abs(diff)) {
					if (diff<0) System.out.println(A+" "+-B);
					else System.out.println(A+" "+-B);
					found = true;
					break;
				}
				if (Math.pow(B, 5)>Math.abs(diff)) break;
			}
			if (found) break;
		}
	}
}