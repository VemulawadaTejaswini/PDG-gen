import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int left = stdin.nextInt() + stdin.nextInt();
		int right = stdin.nextInt() + stdin.nextInt();

		String result = "Left";
		if (left == right) {
			result = "Balanced";
		}
		else if (left < right) {
			result = "Right";
		}

		System.out.println(result);
	}

}
