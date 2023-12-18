import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x * 2 == w && y * 2 == h) {
			System.out.println(w * h / 2 + " " + 1);
		} else {
			System.out.println(w * h / 2 + " " + 0);
		}
	}
}
