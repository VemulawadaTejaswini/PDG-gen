import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "Yes";
		char[] c = new char[s.length()];

		for(int i=0; i<s.length(); i++) {
			c[i] = s.charAt(i);
		}

		if(s.length() % 2 == 0)
			ans = "No";
		else {
			for(int i=0; i<s.length(); i+=2) {
				if(c[i] != 'h' || c[i+1] != 'i') {
					ans = "No";
					break;
				}
			}
		}

		System.out.println(ans);
	}

}
