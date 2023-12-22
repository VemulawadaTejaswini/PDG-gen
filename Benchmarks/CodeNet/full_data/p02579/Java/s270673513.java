import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	int n;
	int m;
	int c=0;
	int dp[][];
	char s[][];
	int dx[]= {1,0,-1,0};
	int dy[]= {0,1,0,-1};
	HashSet<Integer> list[];
	boolean vis[];
	
	@SuppressWarnings("unchecked")
	//Main
	void main() {
		
		n=inp.nextInt();
		m=inp.nextInt();
		int x1=inp.nextInt()-1;
		int y1=inp.nextInt()-1;
		int x2=inp.nextInt()-1;
		int y2=inp.nextInt()-1;
		s=new char[n][m];
		dp=new int[n][m];
		for(int i=0;i<n;i++) {
			s[i]=inp.next().toCharArray();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(s[i][j]=='.' && dp[i][j]==0) dfs(i,j,++c);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				//System.out.print(dp[i][j]+" ");
			}
			//System.out.println();
		}
		if(dp[x1][y1]==dp[x2][y2]){
			System.out.println(0);
			return;
		}
		list=new HashSet[c];
		vis=new boolean[c];
		for(int i=0;i<c;i++) {
			list[i]=new HashSet<Integer>();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(dp[i][j]!=0) {
					for(int p=-2;p<=2;p++) {
						for(int q=-2;q<=2;q++) {
							int x=i+p,y=j+q;
							if(isValid(x,y) && (Math.abs(x-i)==2 || Math.abs(y-j)==2) && dp[x][y]!=dp[i][j] && dp[x][y]!=0) {
								list[dp[i][j]-1].add(dp[x][y]-1);
							}
						}
					}
				}
			}
		}
		for(int i=0;i<c;i++) {
			for(int x:list[i]) {
				//System.out.print(x+" ");
			}
			//System.out.println();
		}
		int start=dp[x1][y1]-1, end=dp[x2][y2]-1;
		//System.out.println(start+" "+end);
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		int gg=1;
		boolean found=false;
		loop:
		while(!q.isEmpty()) {
			Queue qtemp=new LinkedList<Integer>();
			while(!q.isEmpty()) {
				int head=q.poll();
				vis[head]=true;
				for(int x: list[head]) {
					if(!vis[x]) qtemp.add(x);
					if(x==end) {
						found=true;
						break loop;
					}
				}
				q.poll();
			}
			gg++;
			q=qtemp;
		}
		System.out.println(found?gg:-1);
	}
    
    void dfs(int i, int j, int c) {
    	dp[i][j]=c;
    	for(int k=0;k<4;k++) {
    		int x=i+dx[k];
    		int y=j+dy[k];
    		if(isValid(x,y) && s[x][y]=='.' && dp[x][y]==0) {
    			dfs(x,y,c);
    		}
    	}
    }
    
    boolean isValid(int i, int j) {
    	return i>=0 && i<n && j>=0 && j<m;
    }
		
}
