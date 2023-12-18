import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		final int REKI = 2019;
		long[][] ans = new long[s.length+1][REKI];

		if(s.length < 4) {System.out.println(0); return;}

		for(int i = 3 ; i < s.length ; i++ ) {
			for(int j = 0 ; j < REKI ; j++ ) {
				if(ans[i][j] > 0) {
					ans[i+1][(Integer.parseInt(s[i])+j*10) %REKI] = ans[i][j];
				}
			}
			ans[i+1][Integer.parseInt(s[i-3]+s[i-2]+s[i-1]+s[i]) % REKI]++;
		}

		int a = 0;
		for(int i = 0; i < s.length + 1 ; i++) {
			a += ans[i][0];
		}
		System.out.println(a);

	}

}
