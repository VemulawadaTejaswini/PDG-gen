import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Manin {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = (br.readLine());
		String b = (br.readLine());
		String c = (br.readLine());

		System.out.println(a.charAt(0) + b.charAt(1) + c.charAt(2));

	}

}
