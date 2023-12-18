import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		scan.close();
		
		String str = "";
		if (R >= 2800) {
			str = "AGC";
		} else if (R >= 1200) {
			str = "ARC";
		} else {
			str = "ABC";
		}
		System.out.print(str); 
	}
}