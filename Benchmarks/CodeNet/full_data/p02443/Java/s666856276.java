import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j, n, q, index, b, e;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[] a = new int[n];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				b = sc.nextInt();
				e = sc.nextInt();
				for(j = b; j < (e - b)/2 + b; j++) {
					index = e - j + b - 1;
					a[j] = a[j] ^ a[index];
					a[index] = a[j] ^ a[index];
					a[j] = a[j] ^ a[index];
				}
			}
			for(i = 0; i < n - 1; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println(a[n - 1]);
		}
	}
}
