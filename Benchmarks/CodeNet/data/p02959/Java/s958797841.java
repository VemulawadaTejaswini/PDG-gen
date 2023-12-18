import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cityEnemy[] = new int[n + 1];
		int hero[] = new int[n];
		
		for(int i = 0;i < n + 1;i++) {
			cityEnemy[i] = sc.nextInt();
		}

		for(int i = 0;i < n;i++) {
			hero[i] = sc.nextInt();
		}
		
		int killEnemyCnt = 0;
		for(int i = 0; i < n;i++) {
			if(cityEnemy[i] < hero[i]) {
				//i番目の街の処理
				killEnemyCnt += cityEnemy[i];
				hero[i] -= cityEnemy[i];

				if(cityEnemy[i + 1] > hero[i] ) {
					killEnemyCnt += hero[i];
					cityEnemy[i + 1] -= hero[i];

				}else {
					killEnemyCnt += cityEnemy[i + 1];
					cityEnemy[i + 1] = 0;
				}

			}else {
				killEnemyCnt += hero[i];
			}
		}

		System.out.println(killEnemyCnt);
	}
}
