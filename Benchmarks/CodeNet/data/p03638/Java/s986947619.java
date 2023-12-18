import java.util.Scanner;

class Main{


	static	int[][] map;
	static int[] a;
	static int[] b;
	static	int H ;
	static	int W ;


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		H = sc.nextInt();
		W = sc.nextInt();
		int N = sc.nextInt();
		a = new int[N];
		map = new int[H][W];

		b = new int[N];
		int[][] test = new int[H][W];


		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt();
		}
		//Arrays.sort(a);

		for(int i = 0;i < N;i++){
			test[0][0] = i+1;
			b[i]++;
			dfs(i,test,0,0,1);
			test[0][0] = 0;
			b[i]--;


		}





	}

	static void dfs(int nowcolor,int[][] test,int y,int x,int count){

//		System.out.println("y " + y+" x "+x + " color "+nowcolor + " count "+count);
//		for(int i = 0;i < H;i++){
//			for(int j = 0;j < W;j++){
//				System.out.print(test[i][j]);
//			}
//			System.out.println();
//
//		}

		if(count == H*W){			//全部塗り終わったら終了
			for(int i = 0;i < H;i++){
				for(int j = 0;j < W;j++){
					System.out.print(test[i][j]);
				}
				System.out.println();

			}

			System.exit(0);					//終了	
		}

		int[] dx = {-1,1,0,0};
		int[] dy =  {0,0,1,-1};

		for(int i = 0;i < 4;i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(b[nowcolor] >= a[nowcolor]){				//現在の色が条件数濡れていたら次の色に行く.
				nowcolor++;
			}

			if(nx >= 0 && nx <= W-1 && ny >= 0 && ny <= H-1 &&  test[ny][nx] == 0){						//まだ塗ってなかったら、塗る
				b[nowcolor]++;
				test[ny][nx] = nowcolor+1;
				count++;
				dfs(nowcolor, test, ny, nx, count);
				count--;
				b[nowcolor]--;
			}
		}

		return;




	}

}


