import java.util.Scanner;

public class Main {
	static int p[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		if(n == 0) {
			System.out.println(s);
			return;
		}

		String ans = "";
		for(int i = 0; i < s.length(); i++) {
			char c = (char) (s.charAt(i) + n);
			while(c > 'Z') {
				c -= 'Z' - 'A' + 1;
			}
			ans += c;
		}

		System.out.println(ans);

        return;
    }
}

