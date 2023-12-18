import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> cityEnemy = new ArrayList<>();
		List<Integer> hero = new ArrayList<>();

		for(int i = 0;i < n + 1;i++) {
			cityEnemy.add(sc.nextInt());
		}

		for(int i = 0;i < n;i++) {
			hero.add(sc.nextInt());
		}

		int killEnemyCnt = 0;
		for(int i = 0; i < n;i++) {
			if(cityEnemy.get(i) < hero.get(i)) {
				//i番目の街の処理
				killEnemyCnt += cityEnemy.get(i);
				hero.set(i, hero.get(i) - cityEnemy.get(i));

				if(cityEnemy.get(i + 1) > hero.get(i) ) {
					killEnemyCnt += hero.get(i);
					cityEnemy.set(i + 1, cityEnemy.get(i + 1) - hero.get(i));

				}else {
					killEnemyCnt += cityEnemy.get(i + 1);
					cityEnemy.set(i + 1, 0);
				}

			}else {
				killEnemyCnt += hero.get(i);
			}
		}

		System.out.println(killEnemyCnt);
	}
}
