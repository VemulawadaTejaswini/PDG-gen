import java.util.Scanner;


public class Main{
	static int[] dx={1,1,0,-1,-1,-1,0,1};
	static int[] dy={0,-1,-1,-1,0,1,1,1};

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		while(true){
			int w=sc.nextInt();
			int h=sc.nextInt();
			if(w==0) break;

			int[][] B=new int[h][w];
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) B[i][j]=sc.nextInt();

			int ans=0;
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) if(B[i][j]==1) {
				B[i][j]=0;

				int head=0,tail=0;
				int[] Q=new int[h*w];
				Q[tail++]=i*w+j;
				while(head<tail){
					int y=Q[head]/w,x=Q[head]%w; head++;
					for(int k=0;k<8;k++){
						int yy=y+dy[k],xx=x+dx[k];
						if(0<=yy && yy<h && 0<=xx && xx<w && B[yy][xx]==1){
							B[yy][xx]=0;
							Q[tail++]=yy*w+xx;
						}
					}
				}
				ans++;
			}
			System.out.println(ans);
		}

		return;
	}
}