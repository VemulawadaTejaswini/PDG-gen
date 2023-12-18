import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int P = stdIn.nextInt();
		int ans = (A*3+P)/2;
		System.out.println(ans);

	}

}