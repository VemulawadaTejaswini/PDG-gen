import java.util.Arrays;
import java.util.Scanner;



public class Main{
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();
			while(N-->0) {

				//家と家の距離感が長いものは結ばなくていい
				int n = sc.nextInt();
				int k = sc.nextInt();
				k--;
				int[] s = new int[n-1];
				int x = sc.nextInt();
				int pre = x;

				for(int i=1; i<n; i++) {
					x = sc.nextInt();
					s[i-1] = x - pre;
					pre = x;
				}
				Arrays.sort(s);
				long ans = 0;

				for(int i=0; i<s.length - k; i++) {
					ans += s[i];
				}
				System.out.println(ans);

			}
		}
	}
}


