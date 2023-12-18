public class Main {
	public static void main(String[] args) {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		java.util.Arrays.sort(a);
		int count = 0;	//1 2 2 2 3
		int before = -1;
		int same = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] - before == 0) {
				same++;
			} else {
				if (same > 0 && (same % 2 == 1)) {
					count--;
				} else {
					count++;
				}
				same = 0;
			}
			before = a[i];
		}
		if (same > 0 && (same % 2 == 1)) {
			count--;
		}
		System.out.println(count);
	}
}