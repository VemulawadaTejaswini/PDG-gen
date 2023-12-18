import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		String ans = canBeAscending(n, a) ? "YES" : "NO";
		System.out.println(ans);
	}

	static boolean canBeAscending(int n, int[] a) {
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != i + 1) {
				for (int j = i + 1; j < n; j++) {
					if (a[j] != j + 1) {
						if (count >= 1) {
							return false;
						}
						swap(a, i, j);
						count++;
						break;
					}
				}
			}
		}
		return true;
	}

	static void swap(int[] a, int n1, int n2) {
		int tmp = a[n1];
		a[n1] = a[n2];
		a[n2] = tmp;
	}
}
