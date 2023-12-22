import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] Sequence = new int[n];
		for (int i = 0; i < n; i++) {
			Sequence[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int b = sc.nextInt();
			int e = sc.nextInt();
			int k = sc.nextInt();
			int num = 0;
			for (int j = b; j < e; j++) {
				if (Sequence[j] == k) num++;
			}
			System.out.println(num);
		}
	}
}

