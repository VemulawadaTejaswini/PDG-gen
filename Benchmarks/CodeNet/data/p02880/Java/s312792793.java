import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		for(int i = 1; i <= 9; i++) {
			if(n % i == 0) {
				int tmp = n / i;
				if( 1 <= tmp && tmp <= 9) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");
	}
}