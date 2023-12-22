import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static final int INF = 1 << 29;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int swaps = INF;
		int i_ = 0;
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			for(int j=0;j<x;j++) {
				b[i_] = i%2;
				i_++;
			}
		}
		swaps = Math.min(swaps, swaps(a,b));
		for(int i=0;i<n;i++) {
			b[i] = 1 - b[i];
		}
		swaps = Math.min(swaps, swaps(a,b));
		System.out.println(swaps);
	}

	public static int swaps(int[] a,int[] b) {
		int n = a.length;
		int[] ca = Arrays.copyOf(a, n);
		int[] cb = Arrays.copyOf(b, n);
		int suma = 0,sumb = 0;
		for(int i=0;i<n;i++) {
			suma += ca[i];
			sumb += cb[i];
		}
		if (suma != sumb) {
			return INF;
		}
		int swaps = 0;
		for(int i=0;i<n;i++) {
			if (ca[i] == cb[i]) {
				continue;
			}
			for(int j=i+1;j<n;j++) {
				if (ca[i] == cb[j]) {
					cb[j] = cb[i];
					cb[i] = ca[i];
					swaps += (j-i);
					break;
				}
			}
		}
		return swaps;
	}

}