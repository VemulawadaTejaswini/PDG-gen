import java.util.Scanner;

public class Main {
	private static final String YES = "Yes";
	private static final String NO = "No";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		boolean valid = (2*x <= y && y <= 4*x) && y%2 == 0;
		System.out.println(valid ? YES : NO);
	}

}
