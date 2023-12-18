import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp;
		int[] min = {10000, 10000};
		for (int i = 0; i < 3; i++) {
			tmp = sc.nextInt();
			if (tmp < min[0]) {
				min[0] = tmp;
				break;
			} else {
				if (tmp < min[1]) {
					min[1] = tmp;
					break;
				}
			}
		}
		System.out.println(min[0] + min[1]);
	}
}
