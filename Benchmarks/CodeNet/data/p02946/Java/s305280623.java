import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int blackIndex = scan.nextInt();
		
		int[] answer = new int[count * 2 - 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = blackIndex - count + (i + 1);
		}
		
		
		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
}