import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int i = 0;
		String num2,num3;
		
		for(i = 0 ; i < num1 ; i++) {
			num2 = scan.next();
			num3 = num2;
			if(num3 == num2) {
				System.out.println("NO");
				break;
			}
		scan.close();
		System.out.println("YES");
		}
	}
}
