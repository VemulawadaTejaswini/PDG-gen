
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String str3 = sc.next();
		if(str3.equals(str1)) {
			System.out.println((num1-1) + " " + num2);
		}else {
			System.out.println(num1 + " " + (num2-1));
		}
	}

}
