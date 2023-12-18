
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String S=scanner.next();


		int max=0;
		for(int k = 1;k<N;k++) {

		String X = S.substring(0, k);
		String Y= S.substring(k);


		int[] X_cnt = countChar(X);
		int[] Y_cnt = countChar(Y);

		int ans = countMatch(X_cnt,Y_cnt);
		max =(ans>max)?ans:max;
		}


		System.out.println(max);
		scanner.close();
	}

	private static int[] countChar(String s) {
		int[] cnt = new int[26];

		for(int i=0;i<s.length();i++) {
			cnt[s.charAt(i)-'a']++;
		}

		return cnt;
	}

	private static int countMatch(int[] x,int[] y) {
		int ans=0;

		for (int i = 0; i < y.length; i++) {
			if(x[i]>0 && y[i]>0) {
				ans++;
			};
		}
		return ans;
	}

}
