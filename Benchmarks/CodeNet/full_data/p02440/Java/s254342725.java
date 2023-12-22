import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j, n, q, com, b, e;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[] a = new int[n];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				int min = 1000000000, max = -1000000000;
				com = sc.nextInt();
				b = sc.nextInt();
				e = sc.nextInt();
				for(j = b; j < e; j++) {
					if(com == 0) {
						if(min >= a[j]) {
							min = a[j];
						}
					}
					if(com == 1) {
						if(max <= a[j]) {
							max = a[j];
						}
					}
				}
				if(com == 0) {
					System.out.println(min);
				}
				if(com == 1) {
					System.out.println(max);
				}
			}
		}
	}
}
