import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String _str;
		_str = scanner.next();
		scanner.close();
		
		StringBuilder sb = new StringBuilder(_str);

		int total = 0;
		int replaceCount = 0;
		do {
			replaceCount = 0;

			int pos = -1;
			if ((pos = sb.indexOf("01")) >= 0) {
				sb.delete(pos, pos+2);
				replaceCount++;
				total += 2;
			}
			if ((pos = sb.indexOf("10")) >= 0) {
				sb.delete(pos, pos+2);
				replaceCount++;
				total += 2;
			}
		} while (replaceCount > 0);
		
		System.out.println(total);
		
		

	}

}