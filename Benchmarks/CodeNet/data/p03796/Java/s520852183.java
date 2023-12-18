import java.util.Scanner;
public class Main {
	static int power(int n) {
		if(n==1) {
			return 1;
		}
		return n*power(n-1);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int a = power(n);
		System.out.println((int)(a%(1e9+7)));
		
		
		
		
		
	}

}
