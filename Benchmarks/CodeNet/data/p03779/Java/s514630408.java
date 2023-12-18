import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long X = in.nextLong();
		int sum = 0;
		int index = 0;
		while (sum < X) {
			index++;
			sum += index;
		}
		System.out.println(index);
		in.close();
	}
}