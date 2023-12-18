import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//入力
		long N = sc.nextLong();

		long[] vehicle = new long[5];
		for(int i=0; i<vehicle.length; i++) {
			vehicle[i] = sc.nextInt();
		}

		long[] city = {N, 0, 0, 0, 0, 0};

		//時刻の計算
		long ans = 0;
		while(city[5]!=N) {
			//移動量
			long[] p = new long[5];
			for(int i=0; i<p.length; i++) {
				p[i] = Math.min(city[i], vehicle[i]);
			}
			//更新
			for(int i=0; i<p.length; i++) {
				city[i] -= p[i];
				city[i+1] += p[i];
			}

			ans++;

			/*
			//print
			for(long t : city) {
				System.out.print(t+" ");
			}
			System.out.println();
			*/
		}

		System.out.println(ans);

		sc.close();
	}
}