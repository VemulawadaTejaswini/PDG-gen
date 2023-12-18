import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int k = stdin.nextInt();
		
		
		
		
		
		if(n % k == 0)
			System.out.println("0");
		else
			System.out.println("1");
		
	}

}