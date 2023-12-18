import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		int N = scan.nextInt();

		boolean[][] mass = new boolean[H][W];
		for (int i = 0; i < N; i++) {
			mass[scan.nextInt() - 1][scan.nextInt() - 1] = true;
		}
		Map<Integer, Integer> ans = new HashMap<>();
		for(int i= 0; i <= 9; i++) {
			ans.put(i, 0);
		}
		for(int i = 0; i < H - 2; i++) {
			for(int j = 0; j < W -2; j++) {
				int sum = 0;
				for(int x = 0; x < 3; x++) {
					for(int y = 0; y < 3; y++) {
						if(mass[i+x][j+y] == true) {
							sum++;
						}
					}
				}
				ans.put(sum, ans.get(sum) + 1);
			}
		}
		for(int i = 0; i <= 9; i++) {
			System.out.println(ans.get(i));
		}
	}
}
