import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int i;
		
		for(i = 0 ; i < num2 ; i++) {
			int attack_point = scan.nextInt();
			num1 -= attack_point;
		}
		scan.close();
		if(num1 > 0) {
			System.out.println("NO");
		}
		else if (num1 <= 0) {
			System.out.println("YES");
	}}
}