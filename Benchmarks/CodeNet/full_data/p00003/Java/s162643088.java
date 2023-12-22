import java.util.*;

class Main {
	private static boolean isRightTriangle(int[] a) {
		Arrays.sort(a);
		return a[2]*a[2] == a[1]*a[1] + a[0]*a[0];
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int arr[] = new int[3];
			for (int j = 0; j < 3; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(isRightTriangle(arr) ? "YES" : "NO");
		}
	}
}