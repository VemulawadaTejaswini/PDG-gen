import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		String[] map = {"dream", "dreamer", "erase", "eraser"};
		while(S.length() != 0) {
			boolean delete = false;
			for (String target: map) {
				if (S.endsWith(target)) {
					S = S.substring(0, S.length() - target.length());
					delete = true;
					break;
				}
			}
			
			if (!delete) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}
}