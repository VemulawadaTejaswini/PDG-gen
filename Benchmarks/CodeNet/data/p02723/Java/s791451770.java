import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		if (input[2].equals(input[3]) && input[4].equals(input[5])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
