import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] number = new int[N];
		
		for (int i = 0; i < N; i++) {
			number[i] = scan.nextInt();
		}
		
		int total = (number[0] + number[number.length - 1]) * number.length / 2;
		
		int answer = 1 / (1 / total);
		
		System.out.println(answer);
	}
}