import java.util.Scanner;
public class Main {

	//??????????????????????????°
	public static void main(String[] args) {

		int debt = 100000;
		int temp = 0;
		Scanner stdin = new Scanner(System.in);
		int week = stdin.nextInt();

		for(int i = 0; i < week; i++) {

			debt *= 1.05;

			
		}

		System.out.println(debt);

	}

}