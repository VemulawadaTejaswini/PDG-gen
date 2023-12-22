import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
		n=inp.nextInt();
		m=inp.nextInt();
		int INF=1_000_000_0;
		int x1=inp.nextInt()-1;
		int y1=inp.nextInt()-1;
		int x2=inp.nextInt()-1;
		int y2=inp.nextInt()-1;
		s=new char[n][m];
		int dp[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			Arrays.fill(dp[i], INF);
		}
		for (int y=0; y<n; y++) {
			char[] line=inp.next().toCharArray();
			for (int x=0; x<m; x++) {
				s[y][x]=line[x];
			}
		}
		ArrayDeque<Integer> xs = new ArrayDeque<Integer>();
		ArrayDeque<Integer> ys = new ArrayDeque<Integer>();
		xs.add(x1);
		ys.add(y1);
		dp[x1][y1]=0;
		int dx[]= {1,0,-1,0};
		int dy[]= {0,1,0,-1};
		while(!xs.isEmpty()) {
			int x=xs.removeFirst();
			int y=ys.removeFirst();
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				if(isValid(nx,ny)) {
					if(dp[nx][ny]>dp[x][y]) {
						dp[nx][ny]=dp[x][y];
						xs.addFirst(nx);
						ys.addFirst(ny);
					}
				}
			}
			for(int nx=x-2;nx<=x+2;nx++) {
				for(int ny=y-2;ny<=y+2;ny++) {
					if(isValid(nx,ny)) {
						if(dp[nx][ny]>dp[x][y]+1) {
							dp[nx][ny]=dp[x][y]+1;
							xs.addLast(nx);
							ys.addLast(ny);
						}
					}
				}
			}
		}
		out.println(dp[x2][y2]==INF?-1:dp[x2][y2]);
	   	out.close();
	}

	static int n;
	static int m;
	static char s[][];
	
	//Main
	void main() {
		
		
	}
    
    
    
    static boolean isValid(int i, int j) {
    	if(i<0 || i>=n || j<0 || j>=m || s[i][j]=='#') return false;
    	return true;
    }
		
}
