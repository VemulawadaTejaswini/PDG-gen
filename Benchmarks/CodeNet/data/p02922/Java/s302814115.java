import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int answer = 0;
		int count = 1;
		
		while (count < B) {
			count += A - 1;
			answer++;
		}
		
		
		System.out.println(answer);
	}
}