import java.util.Scanner;

class Main{

static char[][] map;
static int H;
static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		H = sc.nextInt();
		W = sc.nextInt();
		map  = new char[H][W];

		for(int i = 0;i < H;i++){
			map[i] = sc.next().toCharArray();
		}
		

		for(int i= 0;i < H;i++){
			for(int j = 0;j < W;j++){
				if(map[i][j] == '#'){
					check(i,j);
				}
			}
				
		}
		System.out.println("Yes");
		
		

	}
	
	static void check(int y,int x){
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,1,-1};
		
		for(int i = 0;i < 4;i++){
				int nx = x + dx[i];
				int ny = y + dy[i];
			if(nx >= 0 && nx < W && ny >= 0 && ny < H && map[ny][nx] == '#'){
				return;
			}
		}
		
		System.out.println("No");
		System.exit(0);
		
		
		
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



