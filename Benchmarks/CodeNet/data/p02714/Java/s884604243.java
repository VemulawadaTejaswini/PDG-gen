import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		sc.nextLine();
		String s = sc.nextLine();

		long cntR = cnt(s,'R');
		long cntG = cnt(s,'G');
		long cntB = cnt(s,'B');

		long anti = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int k = 2*j - i;
				if(k < n) {
					if(s.charAt(i) !=  s.charAt(j) && s.charAt(j) != s.charAt(k) && s.charAt(i) != s.charAt(k)) {
						anti++;
					}
				}
			}
		}

		System.out.println(cntR * cntG * cntB - anti);
	}

	public static long cnt(String str,char c) {
		long cnt = 0;

		for(char x:str.toCharArray()) {
			if(c == x) {
				cnt++;
			}
		}

		return cnt;
	}

}
