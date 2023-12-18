import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int output;
		
		if(N%K == 0) {
			output = 0;
		} else {
			output = 1;
		}
		
		System.out.println(output);
	}

}