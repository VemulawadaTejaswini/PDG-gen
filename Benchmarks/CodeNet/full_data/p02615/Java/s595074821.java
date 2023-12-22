import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		Integer[] a = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		long cnt = 0;
		
		Arrays.sort(a,Collections.reverseOrder());
		
		long tmp = a[0];
		long min = a[1];
		cnt += a[0];
		
		for(int i = 2; i < n; i++) {
			cnt += Math.min(min,a[i-2]);
		}
		
		System.out.println(cnt);
	}

}
