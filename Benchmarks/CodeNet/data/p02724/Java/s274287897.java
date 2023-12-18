import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		
		System.out.println(M / 500 * 1000 + M % 500 / 5 * 5);
		
	}
}