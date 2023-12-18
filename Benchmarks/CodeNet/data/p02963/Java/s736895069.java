import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long s = sc.nextLong();
		int x1 = 0;
		int y1 = 0;
		long x2 = 1000000000;
		int y2 = 1;
		long x3 = (s % x2);
		long y3 = (s / x2);
		System.out.println(x1 + " " + y1 + " " +
				x2 + " " + y2 + " " +
				x3 + " " + y3);
	}
}