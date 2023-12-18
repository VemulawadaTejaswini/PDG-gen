import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	static int[][] dp;
	static long ans = 0;
	static int H;
	static int W;
	static char[][] map;
	static int sub = 0;
	static boolean[][] used;
	static int[][] okblack;
	static ArrayList<Integer> bList;
	static int count;



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] A = new int[N+1];
		long[] sum = new long[N+1];
		long[] oddevensum = new long[N+1];			//偶奇で分けた時の累積和

		for(int i = 1;i <= N;i++){
			A[i] = sc.nextInt();
			sum[i] = sum[i-1]+A[i];
			oddevensum[i] = A[i];
			if(i-2 > 0){
				oddevensum[i] += oddevensum[i-2];
			}
		}
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		for(int i = 0;i < Q;i++){
			int o = sc.nextInt();
			Pair pair = new Pair();
			pair.from = o;
			pair.end = i;
			pairs.add(pair);
		}
		Collections.sort(pairs);
		

	//	System.out.println();
		long[] an = new long[Q];
		
		int y = 1;					//境界
		for(int i = 0; i < pairs.size();i++){
			int x = pairs.get(i).from;			//基準
			while(y <= N && A[y] < x){				//ここで固定を決める
				y++;
			}

			while(y <= N){
				int upper = N - y +1;			//y番目のカードを高橋は何枚目にとるか
				int lower = y - (lowerbond(Math.max(1, 2*x-A[y]),A))+1;		//y番目のカードをaokiは何枚目にとるか
				if(upper > lower){
					y++;
				}else{
					break;
				}
//				System.out.println(upper);
//				System.out.println(lower);

			}
//			System.out.println();
//			System.out.println("y " +y);

			long ans = sum[N] - sum[y-1];			//高橋だけがとる領域についての和
//			System.out.println("ans "+ans);
			int check = N - (N-y+1)*2;		
			if(check > 0){							//高橋と青木が交互にとる領域があるか判定
				ans += oddevensum[check];
			}
			an[pairs.get(i).end] = ans;
		}
//		System.out.println();

		for(int i = 0;i < Q;i++){
			System.out.println(an[i]);
		}
	}

	static int lowerbond(int k, int[] data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
//		System.out.println("return "+min);
		return max;
	}





	static void dfs(int y,int x,int color){
		//						System.out.println("y " + y + " x "+x  );



		if(map[y][x] == '.' && color == 0){
			//										System.out.println("ok");
			sub++;
		}
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,1,-1};
		for(int i = 0;i < 4;i++){
			if(x + dx[i] >= 0 && x + dx[i] < W && y + dy[i] >= 0 && y + dy[i] < H){
				if(color == 1){
					if(map[y+dy[i]][x+dx[i]] == '.' && !used[y+dy[i]][x+dx[i]]){
						used[y+dy[i]][x+dx[i]] = true;
						dfs(y+dy[i], x+dx[i], 0);
						//						used[y+dy[i]][x+dx[i]] = false;;

					}
				}else{
					if(map[y+dy[i]][x+dx[i]] == '#'&& !used[y+dy[i]][x+dx[i]]){
						map[y+dy[i]][x+dx[i]] = '¥';
						count++;
						used[y+dy[i]][x+dx[i]] = true;
						dfs(y+dy[i], x+dx[i], 1);

						//						used[y+dy[i]][x+dx[i]] = false;;

					}
				}
			}
		}

	}



}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

