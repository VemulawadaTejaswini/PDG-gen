import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int count = 0;
		int check = 0;
		
		while(check != 1 && S.length() > 1) {
			for(int i = 0; i < S.length() - 1; i++) {
				if(S.charAt(i) != S.charAt(i + 1)) {
					count += 2;
					if(i > 0) {
						S = S.substring(0, i) + S.substring(i + 2, S.length());
						break;
					} else {
						S = S.substring(i + 2, S.length());
						break;
					}
				}
				if(i == S.length() - 2) {
					check = 1;
				}
			}
		}
		System.out.println(count);
	}
}
