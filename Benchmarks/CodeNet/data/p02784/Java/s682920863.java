import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int i;
		int sum = 0;
		
		for(i = 0 ; i < num2 ; i++) {
			int attack_point = scan.nextInt();
			sum += attack_point;
		}
		scan.close();
		if(num1 > sum) {
			System.out.println("NO");
		}
		else System.out.println("YES");
	}
}