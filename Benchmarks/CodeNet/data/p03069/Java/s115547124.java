import java.util.Scanner;

public class Main {

	static int ans;
	static int N;


	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		String S = sc.next();

		char a[] = new char[N];
		for (int i = 0; i < N; i++) {
			a[i] = S.charAt(i);
		}
		dfs(a,0,0);
		ans = Math.min(ans, N-ans);
		System.out.println(ans);
	}


	static void dfs(char a[],int i,int cnt) {
		if (i==N-1) {
			return;
		}
		if (a[i] == '#') {
			cnt++;
			if (a[i+1] == '.') {
				ans += cnt;
				cnt =0;
			}
		}
		i++;
		dfs(a,i,cnt);
	}
}
