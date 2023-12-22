import java.util.Scanner;

public class Main {

	int[][] field;
	boolean[][] visited;
	
	// (x,y)に爆弾があれば爆破する
	void Bomb(int x, int y){
		if(x<0||y<0||x>=8||y>=8||field[x][y]==0){
			return;
		}
		field[x][y] = 0;
		Bomb(x+1,y);
		Bomb(x+2,y);
		Bomb(x+3,y);
		Bomb(x-1,y);
		Bomb(x-2,y);
		Bomb(x-3,y);
		Bomb(x,y+1);
		Bomb(x,y+2);
		Bomb(x,y+3);
		Bomb(x,y-1);
		Bomb(x,y-2);
		Bomb(x,y-3);
	}
	
	void run(){
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		stdIn.nextLine();
		for(int i=0;i<n;i++){
			stdIn.nextLine();
			field = new int[8][8];
			visited = new boolean[8][8];
			for(int j=0;j<8;j++){
				char[] tmp = stdIn.nextLine().toCharArray();
				for(int k=0;k<8;k++){
					if(tmp[k]=='1'){
						field[j][k] = 1;
					}
				}
			}
			int y = Integer.parseInt(stdIn.nextLine());
			int x = Integer.parseInt(stdIn.nextLine());
			Bomb(--x,--y);
			System.out.println("Data "+(i+1)+":");
			for(int j=0;j<8;j++){
				for(int k=0;k<8;k++){
					System.out.print(field[j][k]);
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}