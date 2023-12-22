import java.util.Scanner;
public class Main{
static int[]check;//1=checked,0=yet,2=checking
static int[][]graph;
static int[][]hz;//[][0]:
static int cnt=0,n;
final static int MAX=100;
	public static void main(String[] args) {
		int i,j,s,pn,num;
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		n=sca.nextInt();
		check=new int[n+1];
		hz=new int[n+1][2];
		graph=new int[MAX+1][MAX+1];
		for(i=1;i<=n;i++){
			num=sca.nextInt();
			pn=sca.nextInt();
			for(j=0;j<pn;j++){
				s=sca.nextInt();
				graph[num][s]=1;
			}
		}
		expl(1);
		for(i=1;i<=n;i++){
				System.out.println(i+" "+hz[i][0]+" "+hz[i][1]);
		}

	}
	public static void expl(int now){
		int i;
		check[now]=2;
		hz[now][0]=++cnt;
		for(i=1;i<=n;i++){
			if(graph[now][i]==1&&check[i]==0)expl(i);
		}
		check[now]=1;
		hz[now][1]=++cnt;
	}

}
