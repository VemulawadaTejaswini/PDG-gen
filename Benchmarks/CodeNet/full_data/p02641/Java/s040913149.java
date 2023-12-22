
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int x = sc.nextInt();
		final int n = sc.nextInt();
		int result = 110;
		int[] arr = new int[110];
		if(n != 0) {
			for(int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				arr[tmp] = tmp;
			}
			int minAbs = 110;
			for(int i = 0; i <= 101; i++) {
				int abs = Math.abs(x - i);
				if(arr[i] == 0 && abs < minAbs) {
					minAbs = abs;
					result = i;
				}
			}
		} else {
			result = x;
		}
		System.out.println(result);
	}

}
