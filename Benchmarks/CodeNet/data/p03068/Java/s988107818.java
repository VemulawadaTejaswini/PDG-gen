import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();
		
		char x = S.charAt(K - 1);
		char[] Sh = new char[S.length()];
		String Sf = "";
		
		for(int i = 0; i < S.length(); i++) {
			Sh[i] = S.charAt(i);
			if(Sh[i] != x) {
				Sh[i] = '*';
			}
			Sf += Sh[i];
		}
		
		System.out.println(Sf);
		
	}
}
