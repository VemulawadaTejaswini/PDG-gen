import java.util.Scanner;

public class Main {
	
	public static final int MAX = 100;
	char[][] farm = new char[MAX][MAX];
	
	void infection(int i, int j, int H, int W, char moji)
	{
		if( farm[i][j] == moji ){
			farm[i][j] = '+';
			if( j + 1 < W ) infection(i, j + 1, H, W, moji);
			if( i + 1 < H ) infection(i + 1, j, H, W, moji);
			if( j - 1 >= 0) infection(i, j - 1, H, W, moji);
			if( i - 1 >= 0) infection(i - 1, j, H, W, moji);
		}
	}	
	
	void run()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		while(true){
			int cnt = 0;
			int H = scan.nextInt();
			int W = scan.nextInt();
			if( H == 0 && W == 0) break;
			
			for (int i = 0; i < H; i++){
				for (int j = 0; j < W; j++){
					if (farm[i][j] == '+') continue;
					cnt++;
					infection(i, j, H, W, farm[i][j]);
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}