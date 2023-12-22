import java.util.Scanner;

public class Main {

	static int bord[][];
	static int mx[]={-1,0,1,0,-1,-1,1,1};
	static int my[]={0,-1,0,1,-1,1,1,-1};
	static int count,w,h;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		while(true){
			count=0;
			w=sc.nextInt();
			h=sc.nextInt();
			if(w+h==0) break;
			bord=new int[w][h];
			for(i=0;i<h;i++){
				for(j=0;j<w;j++){
					bord[j][i]=sc.nextInt();
				}
			}

			for(i=0;i<h;i++){
				for(j=0;j<w;j++){
					if(bord[j][i]==1){
						bord[j][i]=0;
						count++;
						dfs(j,i);
					}
				}
			}
			System.out.println(count);
		}

	}
	static void dfs(int x,int y){
		int i,nx,ny;
		for(i=0;i<8;i++){
			nx=x+mx[i];
			ny=y+my[i];
			if(0<=nx && nx<w && 0<=ny && ny<h && bord[nx][ny]==1){
				bord[nx][ny]=0;
				dfs(nx,ny);
			}
		}
	}
}