import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int num = scn.nextInt();
			System.out.println(num + (num*num) + (num*num*num));
		}
	}
}
