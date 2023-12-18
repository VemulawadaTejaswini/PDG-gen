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
		String s0 = sc.next();
		for (int i = 0; i < n; i++) {
			String s1 = "";
			if (i < n - 1) {
				s1 = sc.next();
			}
			if (!output.equals("")) {
				output += "\n";
			}
			if (s0.equals("AB")) {
				if (a == b) {
					if (s1.equals("AC") && c == 0) {
						a++;
						b--;
						output += "A";
					} else if (s1.equals("BC") && c == 0) {
						a--;
						b++;
						output += "B";
					} else {
						a++;
						b--;
						output += "A";
					}
				} else if (a > b) {
					a--;
					b++;
					output += "B";
				} else {
					a++;
					b--;
					output += "A";
				}
			} else if (s0.equals("AC")) {
				if (a == c) {
					if (s1.equals("AB") && b == 0) {
						a++;
						c--;
						output += "A";
					} else if (s1.equals("BC") && b == 0) {
						a--;
						c++;
						output += "C";
					} else {
						a++;
						c--;
						output += "A";
					}
				} else if (a > c) {
					a--;
					c++;
					output += "C";
				} else {
					a++;
					c--;
					output += "A";
				}
			} else if (s0.equals("BC")) {
				if (b == c) {
					if (s1.equals("AB") && a == 0) {
						b++;
						c--;
						output += "B";
					} else if (s1.equals("AC") && a == 0) {
						b--;
						c++;
						output += "C";
					} else {
						b++;
						c--;
						output += "B";
					}
				} else if (b > c) {
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
			s0 = s1;
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
