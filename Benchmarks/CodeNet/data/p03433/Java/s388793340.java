import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int work = n % 500;
		if(a > work) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
