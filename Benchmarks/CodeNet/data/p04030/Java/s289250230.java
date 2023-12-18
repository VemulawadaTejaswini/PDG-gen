import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		final String s;	// 1≦|s|≦10
		try(Scanner scan = new Scanner(System.in)) {
			s = scan.next();
		}
		
		StringBuilder result = new StringBuilder();
		
		for (char c : s.toCharArray()) {
			switch (c) {
			case '0':
				result.append(c);
				break;
			case '1':
				result.append(c);
				break;
			case 'B':
				if (result.length() != 0) {
					result.deleteCharAt(result.length() - 1);
				}
				break;
			default:
				break;
			}
		}
		
		// 出力
		out.println(result.toString());
		out.close();
	}

}