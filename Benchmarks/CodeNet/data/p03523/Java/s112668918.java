import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			char[] S = sc.next().toCharArray();
			char[] ans = "AKIHABARA".toCharArray();
			int ai = 0;
			for(int i = 0; i < S.length; i++) {
				char c = S[i];
				do{
					if(ans[ai] == c) break;
					if(ans[ai] == 'A' && i < ans.length &&  ans[ai + 1] == c) {
						ai++;
						break;
					}
					System.out.println("NO");
					return;
				} while(false);
				ai++;
			}
			System.out.println("YES");
		}
	}
}
