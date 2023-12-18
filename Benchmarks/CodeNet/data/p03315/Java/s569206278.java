import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr =sc.nextLine().toCharArray();
		sc.close();

		int count = 0;
		for(char c: arr) {
			count += c == '+' ? +1 : -1;
		}
		System.out.println(count);
	}
}
