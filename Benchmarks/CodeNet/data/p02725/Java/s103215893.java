import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n = kb.nextInt();
		int[] a = new int[n * 2];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
			a[i + n] = j + k;
		}
		int count = a[2] - a[0];
		for (int i = 1; i < n; i++) {
			if ((a[i + 2] - a[i]) < count) {
				count = a[i + 2] - a[i];
			}
		}
		System.out.println(count);
		kb.close();
	}

}
