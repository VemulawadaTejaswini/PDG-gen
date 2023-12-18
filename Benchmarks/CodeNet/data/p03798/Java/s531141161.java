import java.util.*;
public class Main {
	static int N, ans[];
	static String s;
	static boolean out;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		s = sc.next();
		sc.close();
		ans = new int[N];
		//羊が0、狼は1
		for(int i=0;i<4;i++) {
			out = false;
			char firstChar = s.charAt(0); 
			Arrays.fill(ans, -1);
			if(i==0) {
				ans[N-1]=ans[0]=0;
			}
			else if(i==1) {
				ans[N-1]=0;ans[0]=1;
			}
			else if(i==2) {
				ans[N-1]=1;ans[0]=0;
			}
			else if(i==3) {
				ans[N-1]=ans[0]=1;
			}
			first_next(firstChar,0,N-1);
			
			for(int j=1;j<N-1;j++) {
				char now = s.charAt(j);
				next(now, j);
				if(out)break;
			}
			lastCheck(s.charAt(N-1),0,N-1);
			if(!out) {
				StringBuilder sb = new StringBuilder();
				for(int t : ans) {
					if(t==0)sb.append("S");
					else sb.append("W");
				}
				System.out.println(sb.toString());
				return;
			}
			

		}
		System.out.println(-1);	
	}
	static void next(char now, int center) {
		if(now=='o') {
			if(ans[center-1]==0&&ans[center]==0)if(!check(center+1, 0))return;
			if(ans[center-1]==0&&ans[center]==1)if(!check(center+1, 1))return;
			if(ans[center-1]==1&&ans[center]==0)if(!check(center+1, 1))return;
			if(ans[center-1]==1&&ans[center]==1)if(!check(center+1, 0))return;
		}else {
			if(ans[center-1]==0&&ans[center]==0)if(!check(center+1, 1))return;
			if(ans[center-1]==0&&ans[center]==1)if(!check(center+1, 0))return;
			if(ans[center-1]==1&&ans[center]==0)if(!check(center+1, 0))return;
			if(ans[center-1]==1&&ans[center]==1)if(!check(center+1, 1))return;
		}
	}
	static boolean check(int next, int z_o) {
		if(ans[next]!=-1&&ans[next]!=z_o) {
			out = true;
			return false;
		}
		ans[next]=z_o;
		return true;
	}
	
	static void first_next(char lastChar, int start, int last) {
		if(lastChar=='o') {
			if(ans[last]==0&&ans[start]==0)if(!check(start+1, 0))return;
			if(ans[last]==0&&ans[start]==1)if(!check(start+1, 1))return;
			if(ans[last]==1&&ans[start]==0)if(!check(start+1, 1))return;
			if(ans[last]==1&&ans[start]==1)if(!check(start+1, 0))return;
		}else {
			if(ans[last]==0&&ans[start]==0)if(!check(start+1, 1))return;
			if(ans[last]==0&&ans[start]==1)if(!check(start+1, 0))return;
			if(ans[last]==1&&ans[start]==0)if(!check(start+1, 0))return;
			if(ans[last]==1&&ans[start]==1)if(!check(start+1, 1))return;
		}
	}
	static void lastCheck(char now, int start, int last) {
		if(now=='o') {
			if(ans[last-1]==0&&ans[last]==0)if(!check(start, 0))return;
			if(ans[last-1]==0&&ans[last]==1)if(!check(start, 1))return;
			if(ans[last-1]==1&&ans[last]==0)if(!check(start, 1))return;
			if(ans[last-1]==1&&ans[last]==1)if(!check(start, 0))return;
		}else {
			if(ans[last-1]==0&&ans[last]==0)if(!check(start, 1))return;
			if(ans[last-1]==0&&ans[last]==1)if(!check(start, 0))return;
			if(ans[last-1]==1&&ans[last]==0)if(!check(start, 0))return;
			if(ans[last-1]==1&&ans[last]==1)if(!check(start, 1))return;
		}
	}
}
