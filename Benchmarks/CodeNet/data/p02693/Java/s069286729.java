import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		if (B - A >= K || B - A == 0) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}
