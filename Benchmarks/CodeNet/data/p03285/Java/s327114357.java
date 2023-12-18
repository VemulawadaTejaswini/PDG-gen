import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		String output = "No";
		
		while(N>=0) {
			if(N%4 == 0) {
				output = "Yes";
			}
			N = N-7;
		}
		
		System.out.println(output);
	}

}