import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int S = stdIn.nextInt();
		int W = stdIn.nextInt();
		if(S <= W) {
			System.out.println("unsefe");
		}else {
			System.out.println("safe");
		}
	}
}