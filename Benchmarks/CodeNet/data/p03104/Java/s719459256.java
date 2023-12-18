import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
		long ans = 0;
		for(int i = 0;i<=b-a;i++) {
			ans = ans ^ (a+i);
		}
		System.out.println(ans);
		scn.close();
	}
}