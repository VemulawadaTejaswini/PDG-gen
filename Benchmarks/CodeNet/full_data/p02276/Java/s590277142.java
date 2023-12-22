import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(scanner.nextLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		int q = partition(a, 0, n - 1);
		for (int i = 0; i < q; i++) {
			sb.append(a[i] + " ");
		}
		sb.append("[");
		sb.append(a[q]);
		sb.append("] ");
		for (int i = q + 1; i < n - 1; i++) {
			sb.append(a[i] + " ");
		}
		sb.append(a[n - 1]);
		System.out.println(sb);
	}

	static int partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p - 1;
		int tmp;
		for (int j = p; j < r; j++) {
			if (a[j] <= x) {
				i = i + 1;
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		tmp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = tmp;
		return i + 1;
	}
}