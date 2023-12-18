import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N= sc.nextInt();
		long Z,W;
		Z=sc.nextLong();
		W=sc.nextLong();
		long a[]= new long[N];
		for (int i=0;i<N;i++) {
			a[i] =sc.nextLong();
		}
		int i=0;
		boolean b=false;
		while (i<N) {
			for (;i<N;i++) {
				if (Z<a[i]) {
					Z=a[i];
					b=true;
					break;
				}
			}
			for (;i<N;i++) {
				if (W>a[i]) {
					W=a[i];
					break;
				}
			}
		}
		if (b) {
			System.out.println(Math.abs(Z-W));
		} else {
			long c[] = Arrays.copyOf(a, a.length);
			Arrays.parallelSort(c);
			System.out.println(Math.abs(c[c.length-1]-a[a.length-1]));
		}
 	}
}