import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int[n];
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) {
			int tr = (t[i - 1] - 1) / t[i] + 1;
			int ar = (a[i - 1] - 1) / a[i] + 1;
			int r = (tr > ar ? tr : ar);
			t[i] *= r;
			a[i] *= r;
		}

		System.out.println(t[n - 1] + a[n - 1]);
	}
}
