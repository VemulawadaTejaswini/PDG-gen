import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		for(int i = 0; i < n; i++) b[i] = sc.nextInt();
		long sumA = 0, sumB = 0;
		for(int i = 0; i < n; i++) {
			sumA += a[i];
			sumB += b[i];
		}
		long sum = sumB - sumA;
		long minA = 0, minB = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] > b[i]) minB += a[i] - b[i];
			else if(a[i] < b[i]) minA += (b[i] - a[i] + 1) / 2;
		}
		if(sum >= minA && sum >= minB) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(sum + " " + minA + " " + minB);
	}
}
