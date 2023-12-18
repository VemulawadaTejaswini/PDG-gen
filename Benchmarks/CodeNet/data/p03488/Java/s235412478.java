import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		List<Integer> xmv = new ArrayList<Integer>();
		List<Integer> ymv = new ArrayList<Integer>();
		
		int cnt = 0;
		boolean goX = true;
		for(int i=0;i<s.length()+1;i++) {
			if(i!=s.length()&&s.charAt(i)=='F')cnt++;
			else {
				if(goX) {
					xmv.add(cnt);
					goX = false;
				}else {
					ymv.add(cnt);
					goX = true;
				}
				cnt = 0;
			}
		}
		
		int xmax = 0;
		for(int i=0;i<xmv.size();i++)xmax+=xmv.get(i);
		
		//xについて
		boolean dp[][] = new boolean[xmv.size()][35000];
		dp[0][xmv.get(0)+16005]=true;
		for(int i=1;i<xmv.size();i++) {
			int dist = xmv.get(i);
			for(int j=-xmax;j<=xmax;j++) {
				dp[i][j+16005] = dp[i-1][j-dist+16005]||dp[i-1][j+dist+16005];
			}
		}
		
		//yについてコピー
		int ymax = 0;
		if(ymv.size()==0)ymv.add(0);
		for(int i=0;i<ymv.size();i++)ymax+=ymv.get(i);
		
		//yについて
		boolean dpy[][] = new boolean[ymv.size()][30000];

		dpy[0][ymv.get(0)+16005]=true;
		dpy[0][-ymv.get(0)+16005]=true;
		for(int i=1;i<ymv.size();i++) {
			int dist = ymv.get(i);
			for(int j=-ymax;j<=ymax;j++) {
				dpy[i][j+16005] = dpy[i-1][j-dist+16005]||dpy[i-1][j+dist+16005];
			}
		}
		
		String ans = "No";
		if(dp[xmv.size()-1][x+16005]&&dpy[ymv.size()-1][y+16005]) ans = "Yes";
		System.out.println(ans);
		
	}
}
