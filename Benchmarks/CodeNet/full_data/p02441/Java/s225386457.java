import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j, n, q, k, b, e, counter;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[] a = new int[n];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				counter = 0;
				b = sc.nextInt();
				e = sc.nextInt();
				k = sc.nextInt();
				for(j = b; j < e; j++) {
					if(a[j] == k) {
						counter++;
					}
				}
				System.out.println(counter);
			}
		}
	}
}
