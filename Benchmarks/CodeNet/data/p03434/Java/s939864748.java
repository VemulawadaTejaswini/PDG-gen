
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] a = new Integer[N];
		for (int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());
		int alice = 0; int bob = 0;
		for (int i=0; i<N; i++) {
			if (i%2 == 0) alice+=a[i];
			else bob+=a[i];
		}
		System.out.println(alice -bob);
	}
}
