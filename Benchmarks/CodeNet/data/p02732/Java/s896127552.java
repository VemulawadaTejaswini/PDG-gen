import java.util.Scanner;

class DBannedK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[200001];
		int[] b = new int[200001];
		int[] actual = new int[n];
		for(int i=0; i<n; i++) {
			int x = scanner.nextInt();
			a[x] += 1;
			actual[i] = x;
		}

		long total = 0;

		for(int i=0; i<n; i++) {
			b[i] = (a[i]*(a[i]-1))/2;
			total += b[i];
		}

		for(int x : actual) {
			System.out.println(total - b[x] + ((a[x]-1) * (a[x]-2))/2);
		}
	}
}