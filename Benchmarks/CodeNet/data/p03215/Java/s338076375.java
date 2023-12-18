import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();	
		}
		int t = 1;
		for (int i = 1; i < n + 1; i++) {
			if (i * (i - 1) / 2 < k  && k < ((i + 1) * i / 2) + 1) {
				t = i;
				break;
			}
		}
		int max = 0; 
		for (int i = 0; i < n - t + 1; i++) {
			max = max + a[i]; 
		}
		for (int i = 1; i < t; i++) {
			int s = 0;
			for (int j = i; j < n - t + i + 1; j++) {
				s = s + a[j];
			}
			if (max < s)
				max = s;
		}
		System.out.println(max);

	}
}