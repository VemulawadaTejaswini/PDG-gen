
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		int x = input.nextInt();
		int y = input.nextInt();
		
		int sum = k*x;
		sum += (n-k)*y;
		System.out.println(sum);

	}

}
