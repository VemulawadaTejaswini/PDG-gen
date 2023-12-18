import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a <= b + c) {
			sb.append(b+c - a);
		} else {
			sb.append(0);
		}
		System.out.println(sb);
	}
}