import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		int count = 0;

		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {

			int day = 1;
			while(day <= d) {
				count++;
				day += a[i];
				if(day > d) {
					break;
				}
			}

		}

		System.out.println(count + x);

	}
}