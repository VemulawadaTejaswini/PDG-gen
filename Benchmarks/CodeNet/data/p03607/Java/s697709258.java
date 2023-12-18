public class Main {
	public static void main(String[] args) {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		java.util.Arrays.sort(a);
		int count = 0;
		int same = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) {	// 同じならセットで読み飛ばす
				i++;
			} else {
				count++;
			}
		}
		System.out.println(count);
}}