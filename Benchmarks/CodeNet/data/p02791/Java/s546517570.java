
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for (int i = 0; i < list.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = i; j >= 0; j--) {
				min = Math.min(min, list[j]);
			}
			if (min >= list[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}
}