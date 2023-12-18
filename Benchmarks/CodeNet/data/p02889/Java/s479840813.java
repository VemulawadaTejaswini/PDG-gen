import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static ArrayList<point>[] map2=new ArrayList[301];
	
	public static int max=987654321;
	public static int[] mark=new int[301];
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N, M, L;
		String[] NML=bf.readLine().split(" ");
		N = Integer.parseInt(NML[0]);
		M = Integer.parseInt(NML[1]);
		L = Integer.parseInt(NML[2]);
		for(int i=0;i<=N;i++) {
			map2[i]=new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			int a, b, c;
			String[] abc=bf.readLine().split(" ");
			a = Integer.parseInt(abc[0]);
			b = Integer.parseInt(abc[1]);
			c = Integer.parseInt(abc[2]);
			point A=new point();
			A.r=b;
			A.c=c;
			point B=new point();
			B.r=a;
			B.c=c;
			map2[a].add(A);
			map2[b].add(B);
		}
		
		int Q = Integer.parseInt(bf.readLine());
		for (int i = 0; i < Q; i++) {
			Arrays.fill(mark, 0);
			int s, r;
			String[] sr=bf.readLine().split(" ");
			s = Integer.parseInt(sr[0]);
			r = Integer.parseInt(sr[1]);
			int ans=dfs(s,r,L,N+1,0,L);
			if(ans==max)
				System.out.println(-1);
			else
				System.out.println(ans);
		}
	}

	public static int dfs(int s, int r, int l,int n,int c,int cl) {
		int ans=max;
		
		if(s==r)
			return c;
		
		if(mark[s]==1)
			return ans;
		
		mark[s]=1;
		ArrayList<point> temp=map2[s];
		for(int i=0;i<temp.size();i++) {
			point maps=temp.get(i);
			if(mark[maps.r]!=1) {
				if(l<maps.c)
					break;
				if(cl>=maps.c) {
					 ans=Math.min(ans, dfs(maps.r,r,l,n,c,cl-maps.c));
					
				}//연료를 넣으면 갈 수 있다.
				else {
					ans=Math.min(ans, dfs(maps.r,r,l,n,c+1,l-maps.c));
				}
			}
		}
		
		mark[s]=0;
		
		return ans;
	}

}

class point{
	int r;
	int c;
}
