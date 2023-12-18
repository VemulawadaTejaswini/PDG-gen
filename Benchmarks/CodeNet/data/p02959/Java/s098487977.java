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
			// i番目のモンスターを倒せるだけ倒す
			ans += Math.min(monsters[i], heros[i]);
			//　余力を計算
			temp = heros[i] - (monsters[i]);
			if(0 < temp) {
				//　余力がある場合はi+1番目のモンスターを倒す
				ans += Math.min(monsters[i + 1] , temp);
				monsters[i + 1] = monsters[i + 1] - Math.min(monsters[i + 1] , temp);	
			}
		}

		System.out.println(ans);
		sc.close();
	}
}