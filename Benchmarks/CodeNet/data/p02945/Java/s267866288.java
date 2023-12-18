import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] results = {a+b, a-b, a*b};

		int max = a+b;
		for(int result : results) {
			max = result > max ? result : max;
		}
		System.out.println(max);
	}
}