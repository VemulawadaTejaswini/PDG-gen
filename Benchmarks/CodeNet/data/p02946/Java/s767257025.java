import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int x = sc.nextInt();

		int start = x - (k-1);
		int end = x + (k-1);

		for (int i = start; i <= end; i++) {
			System.out.print(i);
			System.out.print(" ");
		}

}}