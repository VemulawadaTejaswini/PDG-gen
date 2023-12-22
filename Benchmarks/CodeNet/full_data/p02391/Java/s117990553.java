import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		
		int num1 = kbScanner.nextInt();
		int num2 = kbScanner.nextInt();
		String symbol;
		
		if(num1 > num2){
			symbol = "a > b";
		}else if(num1 < num2){
			symbol = "a < b";
		}else{
			symbol = "a == b";
		}
		
		System.out.println(symbol);
	}
}