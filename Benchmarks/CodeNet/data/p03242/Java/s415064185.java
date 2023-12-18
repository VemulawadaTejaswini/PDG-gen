import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans = br.readLine();

		ans = ans.replaceAll("1", "a");
		ans = ans.replaceAll("9", "1");

		System.out.println(ans.replaceAll("a", "9"));
	}

}