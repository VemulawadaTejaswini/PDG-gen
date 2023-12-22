import java.util.Scanner;

//Alien Messages
public class Main{

	int w, h;
	boolean[][] m;
	int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
	
	void f(int i, int j){
		m[i][j] = false;
		for(int k=0;k<4;k++){
			int ni = i+move[k][0];
			int nj = j+move[k][1];
			if(0<=ni&&ni<h&&0<=nj&&nj<w&&m[ni][nj]){
				f(ni, nj);
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h)==0)break;
			m = new boolean[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)m[i][j]=sc.nextInt()==0;
			int odd = 0;
			int minOdd = 3;
			int n = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(!m[i][j])continue;
					n++;
					int c = 0;
					for(int k=0;k<4;k++){
						int ni = i+move[k][0];
						int nj = j+move[k][1];
						if(0<=ni&&ni<h&&0<=nj&&nj<w&&m[ni][nj])c++;
					}
					if(c%2==1){
						odd++;
						minOdd = Math.min(minOdd, c);
					}
				}
			}
			int x = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(m[i][j]){
						x++;
						f(i, j);
					}
				}
			}
			System.out.println((odd==0||(odd==2&&minOdd==3))&&n>=4&&x==1?"Yes":"No");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}