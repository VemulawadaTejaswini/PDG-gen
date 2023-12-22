import java.util.Scanner; 
public class Main {
	static int W, H, m=11, turn=0;
	static int[][] field;
	static int[] dx={1, 0, -1, 0};
	static int[] dy={0, 1, 0, -1};
	
	static void dfs(int nowh,int noww) {
		if(turn>10)	return;
		turn++;
		for(int d=0; d<4; d++) {
			if(nowh+dy[d]<0||nowh+dy[d]>=H||noww+dx[d]<0||noww+dx[d]>=W) {
				continue;
			}
			if(field[nowh+dy[d]][noww+dx[d]]==1) {
				continue;
			}
			for(int i=1; ; i++) {
				if(nowh+dy[d]*i<0||nowh+dy[d]*i>=H||noww+dx[d]*i<0||noww+dx[d]*i>=W) {
					break;
				}
				if(field[nowh+dy[d]*i][noww+dx[d]*i]==1) {
					field[nowh+dy[d]*i][noww+dx[d]*i]=0;
					dfs(nowh+dy[d]*(i-1), noww+dx[d]*(i-1));
					field[nowh+dy[d]*i][noww+dx[d]*i]=1;
					break;
				}
				if(field[nowh+dy[d]*i][noww+dx[d]*i]==3) {
					m=Math.min(m, turn);
					break;
				}
			}
		}
		turn--;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			W=sc.nextInt();
			H=sc.nextInt();
			if(W+H==0)  break;
			field=new int[H+1][W+1];
			int sh=0, sw=0;
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					field[i][j]=sc.nextInt();
					if(field[i][j]==2){
						sh=i;   sw=j;
					}
				}
			}
			m=11;	turn=0;
			dfs(sh, sw);
			System.out.println((m==11)? -1:m);
			//System.out.println(m);
			
		}

	}
}
