import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		char[] Sh = new char[N];
		int black = 0;
		int white = 0;
		int check = 0;
		
		for(int i = 0; i < N; i++) {
			Sh[i] = S.charAt(i);
			if(Sh[i] == '#' && check == 0) {
				check = 1;
			}
			if(Sh[i] == '#' && check == 1) {
				black++;
			} else if(Sh[i] == '.' && check == 1) {
				white++;
			}
		}
		
		int x = 0;
		
		for(int i = N - 1; i > -1; i--) {
			if(Sh[i] == '#') {
				x++;
			} else {
				break;
			}
		}
		
		black -= x;
		
		if(black != white) {
			System.out.println(Math.min(black, white));
		} else {
			System.out.println(black);
		}
		
	}
}
