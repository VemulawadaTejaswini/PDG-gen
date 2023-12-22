import java.util.Scanner;

public class Main{
	static int[][] dfs(int x,int y,int[][] fie,int[][] flag,int w,int h){
		flag[x][y]=1;
		for(int i=-1;i<=1;i++)for(int j=-1;j<=1;j++){
			int nx=x+i,ny=y+j;
			if(nx>=0 && nx<w && ny>=0 && ny<h){
				if(flag[nx][ny]==0 && fie[nx][ny]==1)flag=dfs(nx,ny,fie,flag,w,h);
			}
		}
		return flag;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[][] fie,flag;
		int w,h;
		fie=new int[60][60];
		flag=new int[60][60];
		while(1>0){
			for(int i=0;i<60;i++)for(int j=0;j<60;j++)flag[j][i]=0;
			w=sc.nextInt();
			h=sc.nextInt();
			if(w+h==0)break;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)fie[j][i]=sc.nextInt();
			int cnt=0;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)if(fie[j][i]==1 && flag[j][i]==0){
				cnt++;
				flag=dfs(j,i,fie,flag,w,h);
			}
			System.out.println(cnt);
		}
	}
}