import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		
		int divNum = S.length() % 2;  
		
		int cnt = 0;
		for (int i = 0, j = S.length(); i < S.length() / 2; ++i, --j) {
			if (!S.substring(i, i+1).equals(S.substring(j -1, j))) {
				cnt++;
			}
		}
		
		int ans = cnt;
		System.out.println(ans);
	}

}
