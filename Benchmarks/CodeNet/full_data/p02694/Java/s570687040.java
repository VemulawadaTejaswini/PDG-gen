import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 100;
		long goal = Long.parseLong(sc.next());

		int count = 0;
		while (start < goal) {
			start = (int) (start * 1.01);
			count++;
		}
		System.out.println(count);

	}

}
