import java.util.Scanner;

class Main{
	static int N;
	static int M;
	static String s, t;

	static String[][] memo;
	static boolean[][] memoflag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		s = sc.next();
		t = sc.next();
		N = s.length();
		M = t.length();

		memo = new String[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				memoflag[i][j] = false;
			}
		}

		String ans = dp(0, 0);

		System.out.println(ans);
		sc.close();
	}

	static String dp(int i, int x) {
		if(i >= N|| x >= M)
			return "";
		if(memoflag[i][x]) {
			String str1 = "", str2 = dp(i + 1, x);
			char a = s.charAt(i);
			for(int j = x; j < M; j++)
				if(a == t.charAt(j)) {
					str1 = a + dp(i + 1, j + 1);
					break;
				}
			if(str1.length() < str2.length())
				memo[i][x] = str2;
			else
				memo[i][x] = str1;
		}
		return memo[i][x];
	}
}
