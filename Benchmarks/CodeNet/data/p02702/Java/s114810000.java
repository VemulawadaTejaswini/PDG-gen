import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		final int REKI = 2019;
		long[][] ans = new long[2][REKI];

		if(s.length < 4) {System.out.println(0); return;}
		int a = 0;
		for(int i = 3 ; i < s.length ; i++ ) {
			int temp =Integer.parseInt(s[i]);
			for(int j = 0 ; j < REKI ; j++ ) {
				if(ans[0][j] > 0) {
					ans[1][(temp + j*10) %REKI] += ans[0][j];
				}
			}
			ans[1][Integer.parseInt(s[i-3]+s[i-2]+s[i-1]+s[i]) % REKI]++;
			
			a+= ans[1][0];
			
			ans[0] = ans[1];
			ans[1] = new long[REKI];
		}

		System.out.println(a);
	}