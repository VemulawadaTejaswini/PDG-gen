import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double a = stdIn.nextInt();
		double b = stdIn.nextInt();

		int ans = 1;
		double check = (b % a)/a;


		if(a != b) {
			ans = (int) ((b-1)/(a-1));
			if(check < 0.5){
				ans = ans + 1;
			}
		}else {
		}
		System.out.println(ans);

	}

}
