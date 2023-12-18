import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] input = new int[n][3];
		for (int i = 0; i < n; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
			input[i][2] = sc.nextInt();
		}
		Arrays.sort(input, new Comparator<int[]>() {
		public int compare(int[] a, int[] b) {
			return b[2] - a[2];
		}
		});
		boolean flag = true;
		int[][] py = new int[101][101];
		for (int k = 0; k < n; k++) {
			if (flag) {
				for (int i = 0; i <= 100; i++) {
					for (int j = 0; j <= 100; j++) {
						py[i][j] = abs(input[k][0], i) + abs(input[k][1], j) + input[k][2];
					}
				}
				flag = false;
			} else {
				for (int i = 0; i <= 100; i++) {
					for (int j = 0; j <= 100; j++) {
						if (input[k][2] == 0) {
							if (py[i][j] > abs(input[k][0], i) + abs(input[k][1], j) + input[k][2]) {
								py[i][j] = 0;
							}
						} else {
							if (py[i][j] != abs(input[k][0], i) + abs(input[k][1], j) + input[k][2]) {
								py[i][j] = 0;
							}
						}
					}
				}
			}
		}
		
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++){
				if (py[i][j] >= max) {
					max = py[i][j];
					maxX = i;
					maxY = j;
				}
			}
		}
		System.out.println(maxX + " " + maxY + " " + max);
	}
	
	public static int abs(int a, int b) {
		if (a > b) {
			return a - b;
		} else {
			return b - a;
		}
	}
}