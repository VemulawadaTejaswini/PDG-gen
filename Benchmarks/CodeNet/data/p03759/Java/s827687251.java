import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] poles = new int[3];
		for (int i = 0; i < 3; i++) {
			poles[i] = in.nextInt();
		}
		boolean isBeautiful = false;
		if (Math.abs(poles[1]-poles[0]) == Math.abs(poles[2] - poles[1])) {
			isBeautiful = true;
		}
		System.out.println(isBeautiful);
	}
}