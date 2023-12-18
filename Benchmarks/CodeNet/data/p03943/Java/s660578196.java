import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String result = " ";

		int [] list = new int [] {a, b, c};
		Arrays.sort(list) ;

		if (list[2] == list[1] + list[0]) {
			result = "Yes" ;
		} else {
			result = "No" ;
		}

        System.out.println(result);
	}
}