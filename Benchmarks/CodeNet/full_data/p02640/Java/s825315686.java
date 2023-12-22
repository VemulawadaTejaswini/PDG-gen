import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
 

		if (b % 2 == 1 || a * 4 < b) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}