import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int min = 1000000, max = -1000000;
		long sum= 0;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		for (int k = 0; k < n; k++) {
			sum += a[k];
			if(min > a[k]) {
				min = a[k];
			}
			if(max < a[k]) {
				max = a[k];
			}
		}
		System.out.println(min + " " + max +" " + sum);
	}
}
