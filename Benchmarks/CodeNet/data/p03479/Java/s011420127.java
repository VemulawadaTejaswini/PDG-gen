import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		long inX = stdin.nextLong();
		long inY = stdin.nextLong();

		System.out.println((long)((Math.log(inY) - Math.log(inX)) / Math.log(2)) + 1);
	}

}
