import java.util.Scanner;

//Alien Messages
public class Main{

	int w, h, si, sj;
	boolean[][] m;
	int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
	int[][] d = {{0,3,1},{1,2,0},{2,3,1},{0,3,2}};
	int c = 0;
	
	boolean f(int i, int j, int r, int dir){
		c++;
		if(c>1<<24)return false;
		if(r==0){
			for(int k=3;k<=5;k++){
				int nd = (dir+k)%4;
				int ni = i+move[nd][0];
				int nj = j+move[nd][1];
				if(ni==si&&nj==sj)return true;
			}
			return false;
		}
		boolean f1, f2;
		f1 = f2 = false;
		for(int k=0;k<3;k++){
			int nd = d[dir][k];
			int ni = i+move[nd][0];
			int nj = j+move[nd][1];
			if(0<=ni&&ni<h&&0<=nj&&nj<w&&m[ni][nj]){
				if(k==0)f1 = true;
				if(k==1)f2 = true;
				if(k==2&&f1&&f2)continue;
				m[ni][nj] = false;
				if(f(ni, nj, r-1, nd))return true;
				m[ni][nj] = true;
			}
		}
		return false;
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h)==0)break;
			m = new boolean[h][w];
			int r = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					m[i][j]=sc.nextInt()==0;
					if(m[i][j])r++;
				}
			}
			if(r==0){
				System.out.println("No");
				continue;
			}
			boolean f = false;
			boolean val = true;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(val&&m[i][j]){
						val = false;
						si = i;
						sj = j;
						m[i][j] = false;
						c = 0;
						f = f(i, j, r-1, 1);
					}
				}
			}
			System.out.println(f?"Yes":"No");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}