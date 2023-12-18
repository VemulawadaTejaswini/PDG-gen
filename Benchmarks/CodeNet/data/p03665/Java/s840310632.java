import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int p = sc.nextInt();
		int[] a = new int[(int)n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		boolean odd = true;
		for(int i = 0 ; i < n ; i++) {
			if(a[i] % 2 != 0) odd  = false;
		}
		if(odd) {
			System.out.println(p == 0 ? 1L<<n : 0);
		} else {
			System.out.println(1L<<(n - 1));
		}
	}
}
