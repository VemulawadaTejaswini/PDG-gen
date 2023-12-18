import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String ans = "";

		if (num < 1200) {
			ans = "ABC";
		} else if (num < 2800) {
			ans = "ARC";
		} else {
			ans = "AGC";
		}

		System.out.println(ans);
	}
}