import java.util.Scanner;
package lesson;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = S / 3600;
		int m = S / 60;
		int s = S - h - m;
		System.out.print("h+:");
		System.out.print("m+:");
		System.out.print("s+:");
	}
}

