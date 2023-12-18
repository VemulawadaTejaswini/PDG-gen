import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int ans = 0;

		int [] list = new int [] {A,B,C};
		Arrays.sort(list);

		ans = (10*list[2] + list[1]) + list[0];

		System.out.println( ans );
	}
}