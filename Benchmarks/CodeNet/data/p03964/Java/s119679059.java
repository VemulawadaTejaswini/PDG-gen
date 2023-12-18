import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();

		}

		int t_hyou = t[0];
		int a_hyou = a[0];

		for (int i = 1; i < n; i++) {
			if (t[i] >= t_hyou && a[i] >= a_hyou) {
			} else {
				int tmpt = t[i];
				int tmpa = a[i];
				while (t[i] < t_hyou || a[i] < a_hyou) {
					t[i] += tmpt;
					a[i] += tmpa;
				}
			}

			t_hyou = t[i];
			a_hyou = a[i];
//			System.out.print(t_hyou + ", ");
//			System.out.print(a_hyou + ", ");
//			System.out.println(t_hyou + a_hyou);

		}
		System.out.println(t_hyou + a_hyou);
		sc.close();
	}
}