

import java.util.Scanner;

public class Main {
//-4462 -3291 -3251 -2409 -679 3095 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] ar = new int[n + 2];
		ar[0] = 0;
		ar[n+1] = 0;
		
		int total = 0;
		for (int i = 1; i < n + 1; i++) {
			ar[i] = scanner.nextInt();
			total += Math.abs(ar[i - 1] - ar[i]);
		}
		scanner.close();
		total += Math.abs(ar[n] - ar[n + 1]);
		
		for (int i = 1; i < n + 1; i++) {
			int a = Math.abs(ar[i-1] - ar[i + 1]);
			int b = Math.abs(ar[i] - ar[i - 1]) + Math.abs(ar[i] - ar[i + 1]);
			System.out.println(total + (a - b));
		}
	}

}
