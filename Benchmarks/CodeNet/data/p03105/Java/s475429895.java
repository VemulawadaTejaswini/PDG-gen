import java.util.Scanner;

//AtCoder Beginner Contest 120
//A	Favorite Sound
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

		int times = B / A;

		System.out.print(Math.min(times, C));
	}
}
