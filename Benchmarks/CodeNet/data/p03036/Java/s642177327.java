import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long r = scn.nextLong();
		long d = scn.nextLong();
		long x = scn.nextLong();
		for(int i = 0;i<10;i++) {
			x=r*x-d;
			System.out.println(x);
		}
	}
}