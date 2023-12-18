import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int ans = Math.abs(Integer.parseInt(s.substring(0, 3))-753);
		for (int i=0; i<s.length()-2; i++) {
			ans = Math.min(ans, Math.abs(Integer.parseInt(s.substring(i,i+3))-753));
		}

		System.out.println(ans);
	}

}
