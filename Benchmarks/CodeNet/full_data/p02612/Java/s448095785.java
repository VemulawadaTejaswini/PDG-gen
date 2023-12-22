import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 文字列
		
		int check = n % 1000;
		int result = 0;
		
		if (check != 0) {
			result = 1000 - check;
		}

		System.out.println(result);
	}
}