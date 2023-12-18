import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int number = 1;
		int i = 0;
		for(i = 0; i < n; i++) {
			if(number <= k) {
				number = number * 2;
			} else {
				number = number + k;
			}
		}
		System.out.println(number);
	}
}