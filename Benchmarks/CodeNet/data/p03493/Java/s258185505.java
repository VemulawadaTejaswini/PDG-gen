import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		System.out.println(s % 100 + (s / 10) % 10 + (s / 100));
	}
}
