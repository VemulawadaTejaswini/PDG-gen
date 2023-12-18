import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n + 2];
		long ans = 0;
		for (int i = 1; i < n+1; i++) {
			a[i] = sc.nextInt();

		}
		a[0] = 0;
		a[n + 1] = 0;
		ans = sum(a);


		for (int i = 1; i < n+1; i++) {

System.out.println(ans-Math.abs(a[i-1]-a[i])-Math.abs(a[i+1]-a[i])+Math.abs(a[i-1]-a[i+1]));
		}

	}

	static void show(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
	}

	static int sum(int a[]) {
		int n = a.length;
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			ans += Math.abs(a[i + 1] - a[i]);
		}
		return ans;
	}

}