import java.util.Scanner;

public class Main {
	private int[] a;
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			if ((n | k) == 0) break;
			
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			
			int max = -100000;
			for (int i = 0; i < n - k + 1; i++) {
				int sum = 0;
				for (int j = i; j < i + k; j++) {
					sum += a[j];
					//System.out.println(a[j]);
				}
				if (sum > max) {
					max = sum;
				}
			}
			
			System.out.println(max);
		}
	}

}