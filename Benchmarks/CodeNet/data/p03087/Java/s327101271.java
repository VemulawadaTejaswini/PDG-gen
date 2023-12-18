import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int Q = reader.nextInt();
		String S = reader.next();
		for (int i = 0; i < Q; i++) {
			int beginIndex = reader.nextInt() - 1;
			int endIndex = reader.nextInt();
			String tmp = S.substring(beginIndex, endIndex);
			int ans = tmp.length() - tmp.replaceAll("AC", "").length();
			System.out.println(ans/2);
		}
		reader.close();
	}
}



