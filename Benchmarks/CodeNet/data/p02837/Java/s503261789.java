import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int x[][] = new int[16][16];
		int y[][] = new int[15][15];
		int ai[] = new int[15];
		for(int i = 1; i < n+1; i++) {
			ai[i] = sca.nextInt();
			for(int j = 1; j < ai[i] + 1; j++) {
				x[i][j] = sca.nextInt();
				y[i][j] = sca.nextInt();
			}
		}

		// xi人目が正直なものと仮定したときでループさせ、
		// 矛盾が発生したとき、xi人目を嘘つきとして次のループへ
		int tr = 1;
		int result = 0;
		int big = 0;
		int human_katei[] = new int[n+1];

		while(tr <= n) {
			for(int i = 1; i < n+1; i++) {
				if(i == tr) {
					human_katei[i] = 1;
				}
				else {
					human_katei[i] = 3;
				}
			}
			for(int j = 1; j < ai[tr] + 1; j++) {
				human_katei[x[tr][j]] = y[tr][j];
			}
			int fal = 0;
			// tr人目が正直者と仮定する。
			for(int i = 1; i < n+1; i++) {
				if(i != tr) {
					int troo = 0;
					for(int j = 1; j < ai[i] + 1; j++) {
						if(human_katei[x[i][j]] == y[i][j] && human_katei[x[i][j]] != 3) {
							troo++;
						}
					}
					if(troo == ai[i]) {
						human_katei[i] = 1;
					}
					else {
						fal++;
					}
				}
			}
			if(fal == n-1) {
				for(int i = 1; i < n+1; i++) {
				human_katei[i] = 0;
				}
			}
			result = 0;
			for(int i = 1; i < n+1; i++) {
				if(human_katei[i] == 1) {
					result++;
				}
			}
			if(result > big) {
				big = result;
			}
			tr++;
		}

		System.out.println(big);
	}
}
