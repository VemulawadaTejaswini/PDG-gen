import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		char[] cs = s.toCharArray();
		
		for (int i = 0; i < cs.length; i++) {
			if (i%2==1) {
				cs[i] = ' ';
			}
		}
		
		String ans = new String(cs);
		System.out.println(ans.replace(" ", ""));
		
		scanner.close();
	}

}