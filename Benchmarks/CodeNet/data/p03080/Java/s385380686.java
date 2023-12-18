import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int rcnt = 0, bcnt = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] == 'R') {
				rcnt++;
			} else {
				bcnt++;
			}
		}
		System.out.println((rcnt > bcnt) ? "Yes" : "No");
	}
}
