import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		String s = scan.next();
		String[] ss = new String[n];
		String[] tt = new String[n];
		String[] uu = new String[n+1];

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
			uu[i] = s.substring(i, i+5);
		}
		Arrays.sort(uu);

		System.out.println(uu[0]);
	}

}
