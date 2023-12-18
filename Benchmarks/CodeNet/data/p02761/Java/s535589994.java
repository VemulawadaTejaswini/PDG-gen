import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] ans = new int [N];
		ArrayList<Integer> keta = new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<>();

		for(int i = 0; i < M; i++) {
			keta.add(sc.nextInt());
			num.add(sc.nextInt());
		}

		//　同じ桁に違う数がある場合
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < M; j++) {
				if(keta.get(i) == keta.get(j)) {
					if(num.get(i) != num.get(j)) {
						System.out.print(-1);
						return;
					}
				}
			}
		}
		
		//　最大桁数が0の場合
		int min = 0;
		if(N != 1) {
			for(int i = 0; i < M; i++) {
				if(keta.get(i) < min) {
					min = keta.get(i);
				}
			}
			
			if(num.get(min) == 0) {
				System.out.print(-1);
				return;
			}
		}
		
		//　最少値を取得
		for(int i = 0; i < M; i++) {
			ans[keta.get(i) - 1] = num.get(i);
		}

		for(int i = 0; i < N; i++) {
			System.out.print(ans[i]);
		}
		sc.close();
	}
	
}