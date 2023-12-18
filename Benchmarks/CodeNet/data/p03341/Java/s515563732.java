import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int wcnt, ecnt;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= n; i++) {
			wcnt = 0;
			ecnt = 0;
			for (int j = 0; j < i; j++) {
				if (s[j] == 'W')
					wcnt++;
			}
			for (int j = i; j < n; j++) {
				if (s[j] == 'E')
					ecnt++;
			}
			min = Math.min(min, wcnt + ecnt);
		}
		System.out.println(min);
	}
}