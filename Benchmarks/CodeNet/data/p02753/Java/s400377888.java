package atcoder;

import java.util.Scanner;

public class ABC158A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//AB入力
		String S = sc.next();

		String s1 = S.substring(0,1);
		String s2 = S.substring(1,2);
		String s3 = S.substring(2,3);

		sc.close();

		if (s1.equals("A") && s2.equals("A") && s3.equals("A")){
			System.out.println("No");
		}else if (s1.equals("B") && s2.equals("B") && s3.equals("B")){
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}