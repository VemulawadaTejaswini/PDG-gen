

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int[] m = new int[n];
		int min = 1000; 
		int count = n;
		for (int i = 0; i < n; i++) {
			m[i] = scanner.nextInt();
			if (m[i] < min) {
				min = m[i];
			}
			
			x -= m[i];
		}
		
		while(x >= 0) {
			x -= min;
			if(x < 0) break;
			count++;
		}
		
		System.out.println(count);
		scanner.close();

	}

}
