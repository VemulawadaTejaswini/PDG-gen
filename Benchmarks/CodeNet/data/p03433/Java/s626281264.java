import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int A = stdIn.nextInt();
		while(N >= 500) {
			N -= 500;
		}
		if(N <= A) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}