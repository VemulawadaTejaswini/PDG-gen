import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            b[i] = stdIn.nextInt();
        }
        int[] c = new int[n];
        for(int i=0; i<n; i++){
            c[i] = stdIn.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        long counter = 0;
        for(int i=0; i<n; i++){
            int lower = lowerBound(a, b[i]);
            int upper = upperBound(c, b[i]);
            counter += (lower * (n -upper));
        }

        System.out.println(counter);
    }

	private static int lowerBound(int[] a, int x) {
		int l = -1, r = a.length - 1;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (x <= a[m]) r = m;
			else l = m;
		}
		if (r == a.length - 1 && a[r] < x) r++;
		return r;
	}

	private static int upperBound(int[] a, int x) {
		int l = 0, r = a.length;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (a[m] <= x) l = m;
			else r = m;
		}

		if (l == 0 && a[l] > x) l--;
		return l + 1;
	}
}
