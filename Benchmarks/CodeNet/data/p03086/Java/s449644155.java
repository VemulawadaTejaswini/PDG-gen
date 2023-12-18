import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();


		int cnt = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'T' || s.charAt(i) == 'G' || s.charAt(i) == 'C') {
				cnt++;
			} else {
				cnt = 0;
			}
			max = Math.max(max, cnt);
		}

		System.out.println(max);
	}

}