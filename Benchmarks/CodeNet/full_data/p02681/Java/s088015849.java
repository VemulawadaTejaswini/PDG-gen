import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S, T;
		char a[] = new char[13];
		S = sc.next();
		T = sc.next();

		char[] c = T.toCharArray();
		for(int i = 0; i < S.length(); i++) {
			a[i] = c[i];
		}

		String B = T.substring(0, S.length());
		System.out.println(B);
		if(S.equals(B)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}