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
			char c = s.charAt(i);
			if(c + n > 'Z') {
				ans =ans +(char)(((c+n)-'A') % ('Z' - 'A') + 'A'-1);
			}else {
				ans = ans + (char)(c+n);
			}
		}

		System.out.println(ans);

        return;
    }
}

