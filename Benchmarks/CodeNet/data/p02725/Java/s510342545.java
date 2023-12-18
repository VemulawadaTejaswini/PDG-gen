import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			a[i] = (scanner.nextInt())%k;

		}
		Arrays.sort(a);

		for(int i=0; i<n; i++) {
			int x1 = k - Math.abs(a[i] - a[(i+1)%n]);
			int x2 = k - Math.abs(a[i] - a[(i+n-1)%n]);
			if(i == 0) {
				x2 += k;
			}
			else if(i == n-1) {
				x1 += k;
			}
			min = Math.min(Math.min(x1, min), x2);
		}

		System.out.println(min);
	}
}