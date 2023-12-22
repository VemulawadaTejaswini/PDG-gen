import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char table[][] = {{'a', 'b', 'c', 'd', 'e'}, {'f', 'g', 'h', 'i', 'j'}, {'k', 'l', 'm', 'n', 'o'}, {'p', 'q', 'r', 's', 't'}, {'u', 'v', 'w', 'x', 'y'}, {'z', '.', '?', '!', ' '}};
		String answer = "NA";
		int index;
		
		while (sc.hasNext()) {
			answer = "";
			index = 0;
			String s = sc.next();
			while (true) {
				int a;
				int b;
				if (index < s.length() && '1' <= s.charAt(index) && s.charAt(index) <= '6') {
					a = s.charAt(index) - '0' - 1;
					index++;
				} else {
					break;
				}
				if (index < s.length() && '1' <= s.charAt(index) && s.charAt(index) <= '5') {
					b = s.charAt(index) - '0' - 1;
					index++;
				} else {
					answer = "NA";
					break;
				}
				answer += table[a][b];
			}
			System.out.println(answer);
		}
	}
}