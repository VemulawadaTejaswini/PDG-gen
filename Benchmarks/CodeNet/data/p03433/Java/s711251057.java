import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt() % 500;
		if ( a > sc.nextInt()) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}


	}

}
