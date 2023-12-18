import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		//文字列の長さ
		int n = scan.nextInt();
		//繰り返す回数
		int k = scan.nextInt();
		//文字列
		String s = scan.next();
		String[] ss = new String[n];
		String[] tt = new String[n];
		String[] uu = new String[n+1];

		for(int ii=0;ii<k;ii++) {
			for(int i=0;i<n;i++) {
				ss[i] = s.substring(i, i+1);
			}

			for(int i=0;i<(n+1)/2;i++) {
				tt[i] = ss[n-i-1];
				tt[n-i-1] = ss[i];
			}

			for(int i=0;i<n;i++) {
				s = s.concat(tt[i]);
			}

			for(int i=0;i<n+1;i++) {
				uu[i] = s.substring(i, i+n);
			}
			Arrays.sort(uu);
			s = uu[0];
		}
		System.out.println(uu[0]);

	}

}
