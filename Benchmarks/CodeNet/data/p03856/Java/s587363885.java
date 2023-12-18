import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String[] de = {"dream", "dreamer", "erase", "eraser"};
		
		String ans = "NO";
		for (int i = 0; i < 4; i++) {
			String str = new String(s);
			for (int j = 0; j < 4; j++) {
				str = str.replaceAll(de[(i + j) % 4], "");
			}
			
			if (str.length() == 0) {
				ans = "YES";
				break;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}


