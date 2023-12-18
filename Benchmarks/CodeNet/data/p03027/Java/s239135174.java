import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int[] x = new int[Q];
		int[] d = new int[Q];
		int[] n = new int[Q];
		for (int i = 0; i < Q; i++) {
			x[i] = sc.nextInt();
			d[i] = sc.nextInt();
			n[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < Q; i++) {
			long ans = 1;
			for (int j = 0; j < n[i]; j++) {
				int multi = (x[i] + (d[i] * j)) %1000003;
				ans = (ans * multi) %1000003;
			}
			System.out.println(ans %  1000003);
		}
	}
}
