import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
//		long ans = 0;

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = true;
//
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}


		Arrays.sort(a);
		Arrays.sort(b);

		for(int i =0;i<n;i++) {
			if(a[i] > b[i]) {
				f = false;
				break;
			}
		}

		if(f)
			System.out.println("Yes");
		else
			System.out.println("No");


		sc.close();
	}
}
