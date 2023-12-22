import java.io.*;
import java.math.*;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		boolean valid = false;
		int K = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();
		for (int i = A; i <= B; i++) {
			if (i%K==0) {
				valid = true;
				break;
			}
		}
		System.out.println(valid?"OK":"NG");
	}
}