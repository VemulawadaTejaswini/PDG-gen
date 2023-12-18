import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		System.out.println((long) Math.pow(L / 3, 3));
	}
}
