import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		
		int num1 = kbScanner.nextInt();
		int num2 = kbScanner.nextInt();
		int num3 = kbScanner.nextInt();
		String answer = "No";
		
		if(num1 < num2 && num2 < num3){
			answer = "Yes";
		}
		
		System.out.println(answer);
	}
}