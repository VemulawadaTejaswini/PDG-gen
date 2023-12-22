import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int X = stdIn.nextInt();
		int Y = stdIn.nextInt();
		int ans = 0;
		ans = X * Y;
		System.out.println(ans);
		stdIn.close();
	}
}