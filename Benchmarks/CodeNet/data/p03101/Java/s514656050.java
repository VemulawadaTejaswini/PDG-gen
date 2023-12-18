import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean[][] array = new boolean[h][w];
		int h2 = sc.nextInt();
		int w2 = sc.nextInt();
		for (int i = 0; i < h2; i++) {
			Arrays.fill(array[i], true);
		}
		
		for (int i = 0; i < w2; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = true;
			}
		}
		
		int count = 0;
		
		for (boolean[] tmp : array) {
			for (boolean flag : tmp) {
				if (!flag) {
					++count;
				}
			}
		}
		
		System.out.println(count);
	}
}
