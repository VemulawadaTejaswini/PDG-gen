import java.util.Scanner;

public class Main {
	private int a[];
	private int sum;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if (n == 0) break;
			
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			
			int sum = 0;
			this.sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					sum += a[j];
					this.sum = Math.max(this.sum, sum);
				}
				sum = 0;
			}
			System.out.println(this.sum);
		}
	}
	
	private void debug() {
		System.out.println();
	}

}