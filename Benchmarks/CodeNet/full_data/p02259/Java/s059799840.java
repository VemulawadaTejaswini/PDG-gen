import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		boolean flag = true;
		int count = 0;
		int j = 0;
		
		while(flag) {
			flag = false;
			for (int i = n - 1; i >= j + 1; i--) {
				if (a[i] < a[i - 1]) {
					int temp = a[i];
					a[i] = a[i - 1];
					a[i - 1] = temp;
					flag = true;
					count++;
				}
			}
			j++;
		}
		
		for (int i = 0; i < n-1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n - 1]);
		
		System.out.print(count);
	}
} 

