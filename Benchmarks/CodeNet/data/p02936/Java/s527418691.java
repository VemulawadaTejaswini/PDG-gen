import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		int Vertlax[][]=new int[N-1][2]; 
		int havenum[]=new int[N]; 
		int ans[] = new int[N];
		ArrayList<String> three = new ArrayList<String>();
		for(int i=0;i<N-1;i++){
		    //出る頂点の名前
		    Vertlax[i][0]=sc.nextInt()-1;
		    //刺さる頂点のname
		    Vertlax[i][1]=sc.nextInt()-1;
		}
		for(int i=0;i<Q;i++){
		    int nowVerat=0;
		    nowVerat=sc.nextInt()-1;
		    havenum[nowVerat]=sc.nextInt()+havenum[nowVerat];
		}
		ans[0]=havenum[0];
		int nowTop=0;
		int preTop=0;
		for(int i=0;i<N-1;i++){
		    ans[Vertlax[i][1]]=havenum[Vertlax[i][0]]+havenum[Vertlax[i][1]];
		    havenum[Vertlax[i][1]]=havenum[Vertlax[i][0]]+havenum[Vertlax[i][1]];  
		}
		System.out.print(ans[0]);  
		for(int i=1;i<N;i++){
		  System.out.print(" "+ans[i]);  
		}
		System.out.println();  
	}
}