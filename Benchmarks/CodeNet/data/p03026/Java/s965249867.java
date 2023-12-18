import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main{
	static ArrayList<Integer>[] uu;
	static int[] c;
	static boolean[][] used;
	static long ans=0;
	static int[] aa;
	static int nn;
	static int n;
	static boolean ct;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		uu=new ArrayList[n];
		used=new boolean[n][n];
		aa=new int[n];
		nn=0;
		for(int i=0; i<n; i++){
			uu[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			uu[a].add(b);
			uu[b].add(a);
		}
		c=new int[n];
		for(int i=0; i<n; i++){
			c[i]=sc.nextInt();
		}
		Arrays.sort(c);
		dfs(-1,0,0);
		System.out.println(ans);
		for(int i=0; i<n; i++){
			System.out.println(aa[i]);
		}
	}
	static void dfs(int front ,int now,int nnn){
		if(nn>n-1){
			return;
		}
		aa[now]=c[nn];
		if(front!=-1){
			ans+=Math.min(c[nnn],c[nn]);
		}
		for(int i:uu[now]){
			if(!used[now][i]){
				used[i][now]=true;
				nn++;
				dfs(now,i,nn-1);
			}
		}
		return;
	}
}
