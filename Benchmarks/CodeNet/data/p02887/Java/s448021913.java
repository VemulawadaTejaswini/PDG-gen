import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] s = in.next().toCharArray();
		int cnt = 0;
		char prev = '#';
		for ( int i = 0; i < n; i++ ) {
			if( prev != s[i]) {
				prev = s[i];
				cnt++;
			}
		}
		System.out.println(cnt);
		in.close();
	}
}