import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String str3 = scan.next();
		scan.close();
		
		if(str1.equals(str3)) {num1 = num1 - 1;}
		else if(str2.equals(str3)) {num2 = num2 - 1;}
		
		System.out.println(num1 + " " + num2);
	}
}
