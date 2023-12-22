import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 1;
		int num2 = 1;
		for(int i = 0;; ++i) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			if(num1 == 0 && num2 == 0) break;
			if(num1 < num2) System.out.println(num1 + " " + num2);
			else System.out.println(num2 + " " + num1);
		}
 }
}