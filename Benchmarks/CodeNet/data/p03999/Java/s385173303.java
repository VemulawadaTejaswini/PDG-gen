import java.util.Scanner;

public class Main {
	static long sum = 0;
	static String S;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		sc.close();
		int l = S.length();
		int[]bit = new int[l - 1];
		bitRec(0, l - 1, bit);
		System.out.println(sum);

	}
	static void bitRec(int k, int n, int[]bit) {
		if(k == n) {
			long t = 0;
			int id = 0;
			for(int i = 0; i <= n; i++) {
				if(i == n) {
					t += Long.parseLong(S.substring(id, n + 1));
					break;
				}
				if(bit[i] == 1) {
					t += Long.parseLong(S.substring(id, i + 1));
					id = i + 1;
				}
			}
			sum += t;
			return;
		}
		bitRec(k + 1, n, bit);
		bit[k] = 1;
		bitRec(k + 1, n, bit);
		bit[k] = 0;
	}
}
