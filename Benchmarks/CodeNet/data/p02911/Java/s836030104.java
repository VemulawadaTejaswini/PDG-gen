import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n + 10];
		for(int i = 0 ; i < q ; i++) {
			a[sc.nextInt()]++;
		}
		String s = "";
		StringBuilder sb = new StringBuilder(s);
		for(int i = 1 ; i <= n ; i++) {
			sb.append((k - (q - a[i]) > 0 ? "Yes" : "No") + "\n");
		}

		sc.close();
		System.out.println(sb.toString());

	}
}

