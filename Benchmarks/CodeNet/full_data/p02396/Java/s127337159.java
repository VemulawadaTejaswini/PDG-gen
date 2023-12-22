import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while((input = sc.nextInt()) != 0) {
			cnt++;
			System.out.println("Case " + cnt + ":" + " " + input);
		}
	}
}