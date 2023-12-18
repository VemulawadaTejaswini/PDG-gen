import java.util.Scanner;

// https://atcoder.jp/contests/abc159/tasks/abc159_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();


		StringBuffer sb = new StringBuffer(s);
		String rvs = sb.reverse().toString();

		if(!(s.equals(rvs))) {
			System.out.println("No");
			return;
		}

		int n = s.length();

		String s2 = s.substring(0,(n-1)/2);
		StringBuffer sb2 = new StringBuffer(s2);
		String rvs2 = sb2.reverse().toString();
		if(!(s2.equals(rvs2))) {
			System.out.println("No");
			return;
		}

		String s3 = s.substring((n+3)/2-1,n);
		StringBuffer sb3 = new StringBuffer(s3);
		String rvs3 = sb3.reverse().toString();
		if(!(s3.equals(rvs3))) {
			System.out.println("No");
			return;
		}


		System.out.println("Yes");

	}
}
