import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String str = scan.next();
		int l = str.length();
		for(int i = l -1;i >= 0 ;i--){
			System.out.print(str.charAt(i));
		}
		System.exit(0);
	}
}