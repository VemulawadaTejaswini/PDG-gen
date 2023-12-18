import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final static int Mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] a = new int [n+1];
		int[] b = new int [m+1];

		for(int i=0;i<n;i++) {a[i] = Integer.parseInt(sc.next());}
		for(int i=0;i<m;i++) {b[i] = Integer.parseInt(sc.next());}
		sc.close();

		Arrays.sort(a);
		Arrays.sort(b);

		//反転
		for(int i=0,j=n,e;i<j;i++,j--) {
			e = a[i];
			a[i] = a[j];
			a[j] = e;
		}
		for(int i=0,j=m,e;i<j;i++,j--) {
			e = b[i];
			b[i] = b[j];
			b[j] = e;
		}

		long res = 1;
		int biggerX_a = 0, biggerX_b = 0;

		for (int x = n*m; x >= 1; x--) {
	        if (a[biggerX_a] > x) {System.out.println(0); return;}
	        if (b[biggerX_b] > x) {System.out.println(0); return;}

	        long tmp = 1;
	        if (a[biggerX_a] == x && b[biggerX_b] == x) {
	            tmp = 1;
	            biggerX_a++; biggerX_b++;
	        }
	        else if (a[biggerX_a] == x) {
	            tmp = biggerX_b;
	            biggerX_a++;
	        }
	        else if (b[biggerX_b] == x) {
	            tmp = biggerX_a;
	            biggerX_b++;
	        }
	        else {
	            tmp = biggerX_a * biggerX_b - (n * m - x);
	            if (tmp <= 0){System.out.println(0); return;}
	        }
	        res = (res * tmp) % Mod;
		}

		System.out.println(res);

	}

}