import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		int cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == '#' && s.charAt(i + 1) == '.')
				cnt++;
		}

		System.out.println(cnt);
	}

}