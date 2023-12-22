import java.util.Scanner;

public class Therefore {
	static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		String str = src.next();
		char c = str.charAt(str.length() - 1);
		if(c == '3') {
			System.out.println("bon");
		}else if(c == '0' || c == '1' || c == '6' || c == '8') {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}
}
