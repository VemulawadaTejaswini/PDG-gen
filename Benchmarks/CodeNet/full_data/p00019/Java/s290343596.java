import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		long fact = 1;
		
		n = sc.nextInt();
		
		for(int i = n; i > 0; i--){
			fact *= i;
		}
		
		System.out.println(fact);
	}
}