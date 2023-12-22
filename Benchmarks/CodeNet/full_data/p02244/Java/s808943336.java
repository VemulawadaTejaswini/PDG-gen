import java.util.Scanner;
public class Main{
static int[] row,col,deg,ndeg;
static int[][]bor;
static int N=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		int i,j,y,x,n;
		n=sca.nextInt();
		bor=new int[N][N];//1=Located,-1=Not located,2=fix;
        row=new int[N];//1=Located,-1=Not located;
        col=new int[N];//1=Located,-1=Not located;
        deg=new int[2*N-1];//1=Located,-1=Not located;
        ndeg=new int[2*N-1];//1=Located,-1=Not located;
        for(i=0;i<N;i++){
        	row[i]=col[i]=-1;
        	for(j=0;j<N;j++){
        		bor[i][j]=-1;
        	}
        }
        for(i=0;i<2*N-1;i++){
        	deg[i]=ndeg[i]=-1;
        }
        for(i=0;i<n;i++){
        	y=sca.nextInt();
        	x=sca.nextInt();
          bor[y][x]=2;
        }
        play(0);
	}
	public static void  play(int a){
	int i;
	if(a==N){
		printboard();
		return;
	}
	for(i=0;i<N;i++){
		if(col[i]==1||deg[a+i]==1||ndeg[a-i+N-1]==1)continue;
		putremo(a,i,1);
		row[a]=i;
		if(bor[a][i]!=2)bor[a][i]=1;
		play(a+1);
	    putremo(a,i,-1);
	    if(bor[a][i]!=2)bor[a][i]=-1;
	    row[a]=-1;
	}
	}
	public static void putremo(int y,int x,int o){
    	col[x]=o;
    	deg[x+y]=o;
    	ndeg[y-x+(N-1)]=o;
	}
	public static void printboard(){
		int i,j;
		for(i=0;i<N;i++){
			for(j=0;j<N;j++){
				if(bor[i][j]==1||bor[i][j]==2){
					if(row[i]!=j)return;
				}
			}
		}
		for(i=0;i<N;i++){
			for(j=0;j<N;j++){
			if(row[i]==j){
				System.out.print("Q");
			}else{
			   System.out.print(".");
			}
		}
			System.out.println("");
	}
	}
}
