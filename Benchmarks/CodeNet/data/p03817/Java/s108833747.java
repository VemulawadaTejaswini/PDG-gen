import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		long ans = 0;
		int count = 0;

		int []a = new int[100001];

		for (int i = 0; i <a.length; i++){
			a[i] = 0;
		}

		for (int i = 0;  i < n; i++) {
			int t = sc.nextInt();
			a[t] += 1;
		}

		Arrays.sort(a);
	//	System.out.println(a[100000]);
	//	System.out.println(a[0]);

		for (;;) {

			if (a[100000] > 1) {
				a[100000] -= 1 ;
				a[99999] -= 1;
				Arrays.sort(a);
			} else {
				break;
			}
		}

		for (int i= 0; i< a.length; i++)
		{
			count += a[i];
		}

		System.out.println(count);
	}

}
