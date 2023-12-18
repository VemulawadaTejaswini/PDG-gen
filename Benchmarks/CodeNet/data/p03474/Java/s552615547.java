import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int A, B;

		A = in.nextInt();
		B = in.nextInt();
		String S = in.next();

		Pattern p = Pattern.compile("^.{" + A + "}-[0-9]{" + B + "}$");
		Matcher m = p.matcher(S);

		if(m.find()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}