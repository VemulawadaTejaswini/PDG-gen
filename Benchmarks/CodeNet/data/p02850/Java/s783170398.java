import java.util.*;
public class Main{
	static int[][] pp;
	static int[] ans;
	static ArrayList<Integer>[] list;
	static int max=0;
	static int n;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		pp=new int[n][n];
		ans=new int[n-1];
		list=new ArrayList[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<n-1; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			list[a].add(b);
			list[b].add(a);
			pp[a][b]=i;
			pp[b][a]=i;
		}
		dfs(-1,-1,0);
		System.out.println(max);
		for(int i=0; i<n-1;i++){
			System.out.println(ans[i]);
		}
		
	}
	static void dfs(int front,int no,int now){
		int count=1;
		for(int i:list[now]){
			if(i==front){
				continue;
			}
			if(count==no){
				count++;
			}
			max=Math.max(max,count);
			if(pp[i][now]>n-1){
				return;
			}
			ans[pp[i][now]]=count;
			dfs(now,count++,i);
		}
	}
}
