import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		String ans = "Yse";
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				if ((a[(i + 1) % n] ^ a[(i - 1) % n]) != a[i]) {
					ans = "No";
				}
			} else {
				if ((a[(i + 1) % n] ^ a[n-1]) != a[i]) {
					ans = "No";
				}
			}
		}
		System.out.println(ans);
    }
}