import java.util.Arrays;
import java.util.Scanner;

class Main{

	static	int count = 0;
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();

		int[][] c = new int[10][10];
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 10;j++){
				c[i][j] = scanner.nextInt();
			}
		}


		int[][] A = new int[H+1][W+1];
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				A[i][j] = scanner.nextInt();
			}
		}

		int[] minsum = new int[10];
		Arrays.fill(minsum, 100000);

		int[][] dis = new int[10][10];

		for(int k = 0;k < 10;k++){

			for(int i = 0;i < 10;i++){			//ある値から1にいくまでの最小の値を求める

				for(int j = 0;j < 10;j++){
					c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);

				}

			}
		}



		
		int ans = 0;
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				if(A[i][j] == -1 ){
					ans += 0;
				}else{
					ans += c[A[i][j]][1];
				}

			}
		}
		System.out.println(ans);

	}



	static int allsum(int[][]c,int i,int j ,int sum,boolean[] flag){


		sum += c[i][j];

		System.out.println("i "+i + " j "+j+" c "+count+" sum "+sum);
		count++;





		if(j == 1){				//現在地が1の時、終了]
			System.out.println("finish");
			return sum;

		}

		flag[j] = true;				//現在地のflagを立てる

		//			for(int t = 0;t < 10;t++){
		//				if(!flag[t]){				//まだ訪れていない数値について調べる

		for(int k = 0; k < 10;k++){
			if(!flag[k]){
				sum =Math.min(sum, allsum(c, j, k, sum, flag));			//iは現在地、kは行き先
			}
		}

		//				}
		//			}

		return sum;

	}




}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


