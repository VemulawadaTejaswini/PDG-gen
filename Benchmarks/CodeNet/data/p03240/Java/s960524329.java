import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] obs = new long[N][3];
		for(int i = 0;i < N;++i) {
			obs[i][0] = sc.nextLong();
			obs[i][1] = sc.nextLong();
			obs[i][2] = sc.nextLong();
		}
		sc.close();
		
		long minX = obs[0][0], maxX = obs[0][0];
		long minY = obs[0][1], maxY = obs[0][1];
		for(int i = 1;i < N;++i) {
			if(minX > obs[i][0])
				minX = obs[i][0];
			else if(maxX < obs[i][0])
				maxX = obs[i][0];
			if(minY > obs[i][1])
				minY = obs[i][1];
			else if(maxY < obs[i][1])
				maxY = obs[i][1];
		}
		
		long[] ans = new long[3];
		for(long x = minX;x <= maxX;++x) {
			for(long y = minY;y <= maxY;++y) {
				long h = Math.abs(obs[0][0] - x) + Math.abs(obs[0][1] - y) + obs[0][2];
				boolean flag = true;
				for(int i = 1;i < N;++i) {
					long tmpH = Math.abs(obs[i][0] - x) + Math.abs(obs[i][1] - y) + obs[i][2];
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
