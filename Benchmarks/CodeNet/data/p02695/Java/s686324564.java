import java.util.*;
import java.io.PrintWriter;
public class Main{
	static int[] pe;
	static int n;
	static int m;
	static int q;
	static int[][] ad;
	static int ans=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		q=sc.nextInt();
		pe=new int[n];
		ad=new int[q][4];
		for(int i=0; i<q; i++){
			ad[i][0]=sc.nextInt()-1;
			ad[i][1]=sc.nextInt()-1;
			ad[i][2]=sc.nextInt();
			ad[i][3]=sc.nextInt();
		}
		dfs(1,0);
		System.out.println(ans);
	}
	static void dfs(int now,int co){
		pe[co]=now;
		if(co==n-1){
			int tmp=0;
			for(int i=0; i<q; i++){
				if(pe[ad[i][1]]-pe[ad[i][0]]==ad[i][2]){
					tmp+=ad[i][3];
				}
			}
			ans=Math.max(ans,tmp);
			return;
		}
		for(int i=now; i<=m; i++){
			dfs(i,co+1);
		}
	}
}