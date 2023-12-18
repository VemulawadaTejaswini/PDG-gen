import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int h = stdIn.nextInt();
		int a = stdIn.nextInt();
		
		int ans = (h+a-1)/a;
		System.out.println(ans);
		



	}

}
