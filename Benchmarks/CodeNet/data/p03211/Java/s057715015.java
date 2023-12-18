import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();

		int n = String.valueOf(s).length();

		int nn = n;

		int[] a = new int[n];

		for(int i=0;i<n;i++) {

			int p = (int)Math.pow(10, nn-1);

			a[i] = (int)s/p;

			s %= p;

			nn--;
		}

		int min = 1000;

		for(int i=0;i<=n-3;i++) {

			int aa = a[i]*100 + a[i+1]*10 +a[i+2];

			int b = Math.abs(aa-753);

			if(min>b) min = b;
		}

		System.out.println(min);
	}

}
