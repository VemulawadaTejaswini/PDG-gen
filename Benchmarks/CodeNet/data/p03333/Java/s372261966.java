import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] map = new int[N][2];
		for (int i = 0; i < N; i++) {
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
		}
		
		//1は即座に答えが出る
		if (N == 1) {
			int ans = Math.min(Math.abs(map[0][0]), Math.abs(map[0][1]));
			System.out.println(ans * 2);
			return;
		}
		
		int[][] x = new int[N][2];
		int[][] y = new int[N][2];
		for (int i = 0; i < N; i++) {
			if (map[i][1] <= 0 && map[i][0] < 0) {
				x[i] = map[i];
			} else if (map[i][0] < 0 && map[i][1] > 0) {
				if (Math.abs(map[i][0]) > Math.abs(map[i][1]))
					x[i] = map[i];
				else 
					y[i] = map[i];
			} else {
				y[i] = map[i];
			}
		}
		
		Arrays.sort(x, (a,b) ->{
			return a[1] - b[1];
		});
		
		Arrays.sort(y, (a,b) -> {
			return a[0] - b[0];
		});
		
		int index = 0;
		int[][] sort = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			if (x[i][0] != 0 || x[i][1] != 0) {
				sort[index] = x[i];
				index++;
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (y[i][0] != 0 || y[i][1] != 0) {
				sort[index] = y[i];
				index++;
			}
		}
		
		int point = 0;
		int ans = 0;
		if (sort[0][0] >= 0 && sort[0][1] > 0) {
			for (int i = 0; i < N / 2; i++) {
				ans += Math.abs(point - sort[N - i - 1][0]);
				point = sort[N - i - 1][0];
				ans += Math.abs(point - sort[i][1]);
				point = sort[i][1];
			}
			if (N % 2 == 1) {
				ans += Math.abs(point - sort[N / 2][0]);
				point = sort[N / 2][0];
			}
		} else {
			for (int i = 0; i < N / 2; i++) {
				ans += Math.abs(point - sort[i][1]);
				point = sort[i][1];
				ans += Math.abs(point - sort[N - i - 1][0]);
				point = sort[N - i - 1][0];
			}
			if (N % 2 == 1) {
				ans += Math.abs(point - sort[N / 2][1]);
				point = sort[N / 2][1];
			}
		}

		

		ans += Math.abs(point);
		System.out.println(ans);
	}
}
