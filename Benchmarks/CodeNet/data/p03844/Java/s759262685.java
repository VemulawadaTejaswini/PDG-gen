
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		int num = sc.nextInt();
		String calc = str.nextLine();
		int num2 = sc.nextInt();
		if(calc.equals("+")) {
			System.out.println(num + num2);
		}else {
			System.out.println(num-num2);
		}
		
		sc.close();
		
		
	}
	

}
