import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < S.length; i++) {
			if(S[i] == 'A' || S[i] == 'C' || S[i] == 'G' || S[i] == 'T') {
				cnt++;
			} else {
				if(cnt > max) max = cnt;
				cnt = 0;
			}
		}
		System.out.println(max);
	}
}