import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		char[] c = sc.next().toCharArray();
		int ans = 0;
		int tmp = 0;
		for (int i = 0; i < n; i++) {
			if (c[i] == 'I') {
				tmp++;
			} else {
				tmp--;
			}
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
		sc.close();
	}
}