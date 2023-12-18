import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 1)
			System.out.println("Hello World");
		else{
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}

	}

}