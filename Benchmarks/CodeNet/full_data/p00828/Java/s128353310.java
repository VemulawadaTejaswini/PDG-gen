import java.util.*;

public class Main{
	public static final int EMPTY = 0;
	public static final int BLACK = 1;
	public static final int WHITE = 2;
	int n;
	int m;
	int p;
	int[] count;
	int basis_num;
	int patern = 13;
	boolean winFrag = false;
	boolean[] colorFrag =  new boolean[patern*2];
	public void run(){
		Scanner scan = new Scanner(System.in);

		while(true){
			n = scan.nextInt();//??§??????
			m = scan.nextInt();//??????????????°
			p = scan.nextInt();//?????§???????????°
			if(n==0 && m==0 && p==0) break;
			int[][][] board = new int[n+1][n+1][n+1];
			for(int i=1;i<n+1;i++){
				for(int j=1;j<n+1;j++){
					for(int k=1;k<n+1;k++){
						board[i][j][k] = EMPTY;
					}
				}
			}
			winFrag = false;
			for(int i=1;i<=p;i++){//???????????°
				int x = scan.nextInt();
				int y = scan.nextInt();
				if(winFrag) continue;
				int z = 0;
				count = new int[patern];
				for(int j=0;j<count.length;j++){
					count[j] = 1;
				}
				for(int j=1;j<n+1;j++){
					if(board[x][y][j] == EMPTY){
						if(i % 2 == 1) board[x][y][j] = BLACK;
	 					else board[x][y][j] = WHITE;
 						z=j;
 						break;
					}
				}
				basis_num = board[x][y][z];
				judge(x,y,z,n,board,i);			
			}
			//System.out.println("-----");
		}
	}
	public void judge(int x,int y,int z,int n,int[][][] board,int turn){
		winFrag = false;
		int j;
		for(int i=0;i<colorFrag.length;i++){
			colorFrag[i] = true;
		}
		for(int i=1;i<n+1;i++){
			j=0;
			if(x+i < n+1)
			if(colorFrag[j] && board[x+i][y][z] == basis_num) count[0]++;
			else colorFrag[j] = false;
			j++;
			
			if(x-i >= 1) 
			if(colorFrag[j] && board[x-i][y][z] == basis_num) count[0]++;
			else colorFrag[j] = false;
			j++;
			//if(x+i < n+1 || x-i >= 1) System.out.println(x+":"+y+" -- "+(x+i) + ":" + (x-i) + " >> " + count[0]);

			if(y+i < n+1) 
			if(colorFrag[j] && board[x][y+i][z] == basis_num) count[1]++;
			else colorFrag[j] = false;
			j++;

			if(y-i >= 1) 
			if(colorFrag[j] && board[x][y-i][z] == basis_num) count[1]++;
			else colorFrag[j] = false;
			j++;

			if(z+i < n+1) 
			if(colorFrag[j] && board[x][y][z+i] == basis_num) count[2]++;
			else colorFrag[j] = false;
			j++;

			if(z-i >= 1) 
			if(colorFrag[j] && board[x][y][z-i] == basis_num) count[2]++;
			else colorFrag[j] = false;
			j++;

			if(x+i < n+1) if(y+i < n+1) 
			if(colorFrag[j] && board[x+i][y+i][z] == basis_num) count[3]++;
			else colorFrag[j] = false;
			j++;

			if(x-i >= 1) if(y-i >= 1) 
			if(colorFrag[j] && board[x-i][y-i][z] == basis_num) count[3]++;
			else colorFrag[j] = false;
			j++;

			if(x+i < n+1) if(z+i < n+1)
			if(colorFrag[j] && board[x+i][y][z+i] == basis_num) count[4]++;
			else colorFrag[j] = false;
			j++;

			if(x-i >= 1) if(z-i >= 1) 
			if(colorFrag[j] && board[x-i][y][z-i] == basis_num) count[4]++;
			else colorFrag[j] = false;
			j++;

			if(y+i < n+1) if(z+i < n+1)
			if(colorFrag[j] && board[x][y+i][z+i] == basis_num) count[5]++;
			else colorFrag[j] = false;
			j++;

			if(y-i >= 1) if(z-i >= 1) 
			if(colorFrag[j] && board[x][y-i][z-i] == basis_num) count[5]++;
			else colorFrag[j] = false;
			j++;

			if(x+i < n+1) if(y-i >= 1) 
			if(colorFrag[j] && board[x+i][y-i][z] == basis_num) count[6]++;
			else colorFrag[j] = false;
			j++;

			if(x-i >= 1) if(y+i < n+1) 
			if(colorFrag[j] && board[x-i][y+i][z] == basis_num) count[6]++;
			else colorFrag[j] = false;
			j++;

			if(x+i < n+1) if(z-i >= 1) 
			if(colorFrag[j] && board[x+i][y][z-i] == basis_num) count[7]++;
			else colorFrag[j] = false;
			j++;

			if(x-i >= 1) if(z+i < n+1)
			if(colorFrag[j] && board[x-i][y][z+i] == basis_num) count[7]++;
			else colorFrag[j] = false;
			j++;

			if(y+i < n+1) if(z-i >= 1) 
			if(colorFrag[j] && board[x][y+i][z-i] == basis_num) count[8]++;
			else colorFrag[j] = false;
			j++;

			if(y-i >= 1) if(z+i < n+1)
			if(colorFrag[j] && board[x][y-i][z+i] == basis_num) count[8]++;
			else colorFrag[j] = false;
			j++;


			if(x+i < n+1) if(y+i < n+1) if(z+i < n+1)
			if(colorFrag[j] && board[x+i][y+i][z+i] == basis_num) count[9]++;
			else colorFrag[j] = false;
			j++;

			if(x-i >= 1) if(y-i >= 1) if(z-i >= 1) 
			if(colorFrag[j] && board[x-i][y-i][z-i] == basis_num) count[9]++;
			else colorFrag[j] = false;
			j++;

			if(x-i >= 1) if(y+i < n+1) if(z+i < n+1)
			if(colorFrag[j] && board[x-i][y+i][z+i] == basis_num) count[10]++;
			else colorFrag[j] = false;
			j++;

			if(x+i < n+1) if(y-i >= 1) if(z-i >= 1) 
			if(colorFrag[j] && board[x+i][y-i][z-i] == basis_num) count[10]++;
			else colorFrag[j] = false;
			j++;

			if(x+i < n+1) if(y-i >= 1) if(z+i < n+1)
			if(colorFrag[j] && board[x+i][y-i][z+i] == basis_num) count[11]++;
			else colorFrag[j] = false;
			j++;

			if(x-i >= 1) if(y+i < n+1) if(z-i >= 1) 
			if(colorFrag[j] && board[x-i][y+i][z-i] == basis_num) count[11]++;
			else colorFrag[j] = false;
			j++;

			if(x+i < n+1) if(y+i < n+1) if(z-i >= 1) 
			if(colorFrag[j] && board[x+i][y+i][z-i] == basis_num) count[12]++;
			else colorFrag[j] = false;
			j++;

			if(x-i >= 1) if(y-i >= 1) if(z+i < n+1)
			if(colorFrag[j] && board[x-i][y-i][z+i] == basis_num) count[12]++;
			else colorFrag[j] = false;
			
		}
		for(int i=0;i<count.length;i++){
			if(count[i] >= m){
				if(basis_num == BLACK) winBlack(turn);
				else if(basis_num == WHITE) winWhite(turn);
				winFrag = true;
				break;
			}
		}
		if(winFrag == false && turn == p) draw();
	}

	public void winBlack(int turn){
		System.out.println("Black "+turn);
	}
	public void winWhite(int turn){
		System.out.println("White "+turn);
	}
	public void draw(){
		System.out.println("Draw");
	}
	public static void main(String[] args){
		Asia2004B app = new Asia2004B();
		app.run();	
	}
}