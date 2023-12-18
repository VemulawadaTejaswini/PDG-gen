import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++)
			a[i] = Math.abs(sc.nextInt()-x);
		
		int d = a[0];
		for (int i=1;i<n;i++) {
			d = gcd(d,a[i]);
		}
		System.out.println(d);
		
	}

	private static int gcd(int a, int b) {
		return b==0?a:gcd(b,a%b);
	}

}
