import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] arr = new int[n];
		
		int min = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			if (i > 0) {
				arr[i-1] = a[i] - a[i - 1];
				min += arr[i-1]; 
			}
		}
		arr[n - 1] = k - a[n-1];
		
		int i = 1;
		int e = n - 1;
		int nextMin = min;
		while (i < n) {
			
			nextMin = nextMin - arr[i - 1] + arr[e++];
			min = Math.min(min, nextMin);
			
			if (e >= n) {
				e = 0;
			}
			i++;
		}
		System.out.println(min);
	}

}
