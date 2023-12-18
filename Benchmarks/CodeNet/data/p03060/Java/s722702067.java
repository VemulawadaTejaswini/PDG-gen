import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(N);
		int answer = 0;
		while (N-- > 0){

			int V = scanner.nextInt();
			int C = scanner.nextInt();
			if (V - C > 0){
				
				answer = answer + (V - C); 
			}
		}
		System.out.println(answer);
	}
}
