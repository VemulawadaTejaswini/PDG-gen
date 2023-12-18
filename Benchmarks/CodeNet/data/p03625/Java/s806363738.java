import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main (String[] args) {
		// for C
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt ();
		int[] a = new int[N];
		int i;
		for (i=0; i<N; i++)
			a[i] = sc.nextInt ();
		Arrays.sort (a);
		int h=0, w=0;
		for (i=N-2; i>=0; i--) {
			if (a[i+1]==a[i]) {
				h = a[i];
				i-=2;
				break;
			}
		}
		for (; i>=0; i--) {
			if (a[i+1]==a[i]) {
				w = a[i];
				break;
			}
		}
		System.out.println (h*w);
	}
}