import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] monsters = new int [N + 1];
		int[] heros = new int [N];
		int temp = 0;
		int ans = 0;
		
		for(int i = 0; i < N + 1; i++) {
			monsters[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++) {
			heros[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(monsters[i] < heros[i]) {
				ans += monsters[i];
				//　余力を計算
				temp = heros[i] - (monsters[i]);
				if(monsters[i + 1] < temp) {
					//　余力がある場合はi+1番目のモンスターを倒す
					ans += monsters[i + 1];
					monsters[i + 1] = 0;
				}else {
					ans += temp;
					monsters[i + 1] = monsters[i + 1] - temp; 
				}
			}else {
				ans += heros[i];
			}
		}

		System.out.println(ans);
		sc.close();
	}
}