import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();

		int fif = x/500;

		int five = (x-fif*500)/5;

		System.out.println(fif*1000+five*5);


	}

}
