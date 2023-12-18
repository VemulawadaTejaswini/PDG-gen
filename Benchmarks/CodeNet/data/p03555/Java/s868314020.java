import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		
		char[] check = s2.toCharArray();
		char[] reverse = new char[s2.length()];
		
		for (int i = 0; i < reverse.length; i++) {
			reverse[i] = check[check.length-i-1];		
		}
		String rString = new String(reverse);
		if (rString.equals(s1)) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		scanner.close();
	}
}
