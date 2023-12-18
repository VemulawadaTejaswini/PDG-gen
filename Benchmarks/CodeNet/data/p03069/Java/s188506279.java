import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		
		int cnt = 0;
		for(int i = 0; i <  S.length()-1; i++) {
			if((S.charAt(i) == '.' && S.charAt(i+1) == '#')
					|| (S.charAt(i) == '#' && S.charAt(i+1) == '#')) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}