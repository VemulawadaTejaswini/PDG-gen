import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int  N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();
		
		String s = "";
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == S.charAt(K)) {
				s += S.charAt(i);
			}else {
				s += '*';
			}
		}
		
		
		System.out.println(s);
	}
}
