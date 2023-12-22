import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n + 1];
		for(int i = 1 ; i <= n ; i++) {
			a[i] = sc.nextLong();
		}
		String s = "";
		for(int i = k + 1 ; i <= n ; i++) {
			if(a[i - k ] >= a[i]) {
				s = s + "No\n";
			}
			else
				s = s + "Yes\n";
		}

		sc.close();
		System.out.println(s);

	}
}

