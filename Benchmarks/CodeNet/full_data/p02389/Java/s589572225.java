import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lines = sc.nextLine().split(" ");
		int height = Integer.parseInt(lines[0]);
		int width = Integer.parseInt(lines[1]);
		System.out.println((height * width) + " " + (height * 2) + (width * 2));
	}
}