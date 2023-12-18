import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();	
		
		int total = 0;

		for(int i = a; i > 0 && k > 0 ; i--) {
			total++;
			k--;
		}
		

		for(int i = b; i > 0 && k > 0 ; i--) {
			k--;
		}
		
		for(int i = c; i > 0 && k > 0 ; i--) {
			total--;
			k--;
		}
		
		System.out.println(total);
	}
}
