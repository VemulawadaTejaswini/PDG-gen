import java.util.Scanner;

public class Main {
	static boolean memo[];
	static boolean ok;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a, cnt = 0;
		for (int i = 1; i <= n; i++) {
			a = sc.nextInt();
			if (i != a) {
				cnt++;
			}
		}
		if(cnt == 2 || cnt == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}