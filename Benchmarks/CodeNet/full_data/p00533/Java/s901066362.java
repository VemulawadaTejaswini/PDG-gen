import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] weather = new char[h][w];
		int[][] result = new int[h][w];
		for (int i = 0; i < h; i++) {
			weather[i] = sc.next().toCharArray();
		}
		int cnt;
		for(int i = 0; i < h; i++) {
			cnt = -1;
			for(int k = 0; k < w; k++) {
				if(weather[i][k] == 'c') {
					cnt = 0;
					result[i][k] = cnt;
					cnt = cnt + 1;
				} else if(cnt >= 0) {
					result[i][k] = cnt;
					cnt = cnt + 1;
				} else {
					result[i][k] = cnt;
				}
				
			}
		}
		for(int i = 0; i < h; i++) {
			for(int k = 0; k < w; k++) {
				System.out.print(result[i][k] + " ");
				if(k == w - 1) {
					System.out.println();
				}
			}
		}
	}

}