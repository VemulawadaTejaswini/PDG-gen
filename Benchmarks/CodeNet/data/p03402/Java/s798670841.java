import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int white = sc.nextInt();
		int black = sc.nextInt();
		char[][] chars = new char[100][100];
		for (int h = 0; h < 50; h++) {
			for (int w = 0; w < 100; w++) {
				chars[h][w] = '.';
			}
		}
		for (int h = 50; h < 100; h++) {
			for (int w = 0; w < 100; w++) {
				chars[h][w] = '#';
			}
		}
		for(int i = black-1; i > 0; i--) {
			int h = (i / 50)*2;
			int w = (i % 50)*2;
			chars[h][w] = '#';
		}
		for(int i = white-1; i > 0; i--) {
			int h = (i / 50)*2+50;
			int w = (i % 50)*2;
			chars[h][w] = '.';
		}
		System.out.println(100+" "+100);
		for(char[] a : chars) {
			for(char c : a) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}