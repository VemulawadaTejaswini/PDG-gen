import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[5];
		for (int i = 0; i < 6; i++) {
			count[sc.nextInt()]++;
		}
		boolean bre = false;
		for (int i = 1; i <= 4; i++) {
			if (count[i] != 1 && count[i] != 2) {
				bre = true;
				break;
			}
		}
		if (!bre) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}