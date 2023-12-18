import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if(str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2)) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}