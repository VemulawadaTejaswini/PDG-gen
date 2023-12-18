import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] obs = new int[N][3];
		for(int i = 0;i < N;++i) {
			obs[i][0] = sc.nextInt();
			obs[i][1] = sc.nextInt();
			obs[i][2] = sc.nextInt();
		}
		sc.close();
		
		int[] ans = new int[3];
		for(int x = 0;x <= 100;++x) {
			for(int y = 0;y <= 100;++y) {
				int h = Math.abs(obs[0][0] - x) + Math.abs(obs[0][1] - y) + obs[0][2];
				boolean flag = true;
				for(int i = 1;i < N;++i) {
					int tmpH = Math.abs(obs[i][0] - x) + Math.abs(obs[i][1] - y) + obs[i][2];
					if(tmpH != h) {
						flag = false;
						break;
					}
				}
				if(flag) {
					ans[0] = x;
					ans[1] = y;
					ans[2] = h;
					break;
				}
			}
		}
		
		System.out.println(String.format("%d %d %d", ans[0], ans[1], ans[2]));
	}
}
