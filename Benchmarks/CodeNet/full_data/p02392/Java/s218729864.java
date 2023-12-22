import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int z = stdIn.nextInt();
		String ans;
		if( x < y && y < z) {
			ans = "Yes";
		} else {
			ans = "No";
		}
		stdIn.close();
		System.out.println(ans);

	}

}

