import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int one = N % 100 % 10;
		int two = N % 100 / 10;
		int three = N / 100;
		
		if(one % 7 == 0 || two % 7 == 0 || three % 7 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}