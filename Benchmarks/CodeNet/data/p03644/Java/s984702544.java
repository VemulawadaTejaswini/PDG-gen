import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = 1;

		while(num*2 <= n) {
			num = num*2;
		}

		System.out.println(num);
	}
}
