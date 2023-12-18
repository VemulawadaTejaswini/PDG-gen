import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int a = in.nextInt(), b = in.nextInt();
		int ans = a + b;
		System.out.println(ans >= 10 ? "error" : ans);
	}
}
