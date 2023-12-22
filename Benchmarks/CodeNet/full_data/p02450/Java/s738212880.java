import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String numberArray = "";
		for(int i = 1; i <= n; i++) {
			numberArray += String.valueOf(i);
		}

		permutation(numberArray, "");
	}

	public static void permutation(String s, String ans) {
		if(s.length() <= 1) {
			if(ans.length() != 0) ans += " ";
			System.out.println(ans + s);
		}
		else {
			for(int i = 0; i < s.length(); i++) {
				if(ans.length() == 0) permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
				else permutation(s.substring(0, i) + s.substring(i + 1), ans + " " + s.charAt(i));
			}
		}
	}
}

