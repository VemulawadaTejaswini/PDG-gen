import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		int count = 1;
		char start = S.charAt(0);
		
		for (int i = 1; i < 4; i++) {
			if (start == S.charAt(i)) {
				count++;
			} else {
				start = S.charAt(i);
				count = 1;
			}
			
			if (count >= 3) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
		
	}
}