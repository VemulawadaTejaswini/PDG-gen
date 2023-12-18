import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = 1;
		int digit = 0;
		while(a<n) {
			a *= k;
			digit++;
		}
		System.out.println(digit);
		sc.close();
	}
}