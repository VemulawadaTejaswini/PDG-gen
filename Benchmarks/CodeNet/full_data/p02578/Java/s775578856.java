import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class Main {
	//2-100
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long ar[] = new long[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		Arrays.sort(ar);
		System.out.println(ar[n-1]-ar[0]);
	}

}