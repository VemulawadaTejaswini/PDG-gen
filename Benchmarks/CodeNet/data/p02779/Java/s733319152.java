import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String k = "YES";
		int count = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
		}
		while (count < n) {
			for (int i = count; i < n - 1; i++) {
				if (a[count] == a[i + 1]) {
					k = "NO";
					break;
				}
			}
			count++;
			break;
		}
		System.out.println(k);
		kb.close();
	}
}
