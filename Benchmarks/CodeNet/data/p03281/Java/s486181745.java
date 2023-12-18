import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if(N<105) {
			System.out.println(0);
		}else if(N<135) {
			System.out.println(1);
		}else if(N<165) {
			System.out.println(2);
		}else if(N<195) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}

}
