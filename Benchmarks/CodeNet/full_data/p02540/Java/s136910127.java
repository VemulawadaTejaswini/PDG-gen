
import java.util.*;
import java.io.*;
public class Main {

	static int mod = (int) (1e9 + 7);
	static List<Integer> adj[];
	public static void main(String[] args) throws java.lang.Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[][]=new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i][0]=Integer.parseInt(st.nextToken());
			a[i][1]=Integer.parseInt(st.nextToken());
		}
		adj=new ArrayList[n+1];
		for(int i=1; i<=n; i++) adj[i]=new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i!=j) {
					int x=a[j][0],y=a[j][1];
					if(a[i][0]>x && a[i][1]>y || a[i][0]<x && a[i][1]<y) {
						adj[i+1].add(j+1);
						
					}
				}
			}
		}
		for(int i=1; i<=n; i++) {
			int ans=1;
			for(int x: adj[i]) {
				ans+=adj[x].size();
			}
			System.out.println(ans);
		}
	}

}
