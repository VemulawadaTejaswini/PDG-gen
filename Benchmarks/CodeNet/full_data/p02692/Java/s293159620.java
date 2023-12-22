import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		String output = "";
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (!output.equals("")) {
				output += "\n";
			}
			if (s.equals("AB")) {
				if (a > b) {
					a--;
					b++;
					output += "B";
				} else {
					a++;
					b--;
					output += "A";
				}
			} else if (s.equals("AC")) {
				if (a > c) {
					a--;
					c++;
					output += "C";
				} else {
					a++;
					c--;
					output += "A";
				}
			} else if (s.equals("BC")) {
				if (b > c) {
					b--;
					c++;
					output += "C";
				} else {
					b++;
					c--;
					output += "B";
				}
			}

			if (a < 0 || b < 0 || c < 0) {
				output = "";
				break;
			}
		}

		// 出力
		if (output.equals("")) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			System.out.println(output);
		}
		sc.close();
	}
}
