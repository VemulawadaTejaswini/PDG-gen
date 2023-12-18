import java.util.Scanner;

public class contest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(2*b > a) {
			System.out.println(0); 
		}
		else System.out.println(a - 2*b);
	}
}
