import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int W = scan.nextInt();
		
		if (S >= W) {
			System.out.println("unsafe");
		} else if(S < W) {
			System.out.println("safe");
		}

	}

}
