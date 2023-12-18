import java.util.Scanner;

class Main{

	static char[][] map;
	static int N;
	static int M;
	static boolean flag;
	static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		M = sc.nextInt();
		map  = new char[100][100];

		for(int i = 0;i < 100;i++){
			for(int j = 0;j <100;j++){
				if(j < 50){
					map[i][j] = '.';
				}else{
					map[i][j] = '#';
				}
			}
		}
		int count = 0;
		int num = 0;
		
		for(int i = 0;i < 50;i= i+2){
			if(99-(i+1) < 50){
				count = count+2;
				i = 0;
			}
			map[count+1][99-(i+1)] ='.'; 
			num++;
			if(num == N-1){
				break;
			}
		}
		
		count = 0;
		num = 0;
		for(int i = 0;i < 50;i = i+2){
			if(i+1 >= 50){
				count = count+2;
				i = 0;
			}
			map[count+1][i+1] ='#'; 
			num++;
			if(num == M-1){
				break;
			}
		}
		
		System.out.println("100 100");
for(int i = 0;i <50;i++){
	System.out.println(map[i]);
}


	}
	static void dfs(int y,int x,int sum){

		try {

			int[] dx = {-1,0,0,1,0};
			int[] dy = {0,-1,1,0,0};

			for(int i = 0;i < 5;i++){
				int ny = y + dy[i];
				int nx = x + dx[i];
				if(nx >= 0 && nx <= M-1 && ny >= 0 && ny <= N-1 && map[ny][nx] =='0' ){
					map[ny][nx] = '.';

				}else if(nx >= 0 && nx <= M-1 && ny >= 0 && ny <= N-1 && map[ny][nx] =='.' ){
					map[ny][nx] = '0';

				}

			}
			sum++;	


			for(int i = 0;i < N;i++){
				for(int j = 0;j < M;j++){
					if(map[i][j] == '0'){
						dfs(i,j,sum);
					}
				}
			}
			ans = Math.min(ans, sum);
			return;
		}catch (StackOverflowError  e) {
			System.out.println(-1);

			System.exit(0);
		}
	}


}

class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



