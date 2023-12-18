import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		int cnt = 0;
		
		for(int i = 0; i <  S.length()-2; i++) {
			if(S.charAt(i) == '#' && S.charAt(i+1) == '.') {
				if(S.charAt(i+2) == '.') {
					cnt++;
				}else {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}