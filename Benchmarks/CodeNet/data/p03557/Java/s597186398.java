import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}		
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}		
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		
		int count = 0;
		int high = 0;
		int low = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (b[i] > a[j]) {
					low++;
				}
				if (b[i] < c[j]) {
					high++;
				}
			}
			count += low * high;
			low = 0;
			high = 0;
		}
		System.out.println(count);
	}
}
