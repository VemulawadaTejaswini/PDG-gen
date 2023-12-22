import java.util.*;

public class Main {
	static boolean arive=false;
	static int t[];
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); t=new int[n];
		
		for(int i=0;i<n;i++)t[i]=Integer.parseInt(in.next());
		
		solve1(0);
		if(arive) {
			arive=false;
			solve2(n-1);
			if(arive)System.out.println("yes");
			else System.out.println("no");
		}
		else System.out.println("no");

	}
	
	static void solve1(int u) {
		//System.out.println(u);
		if(u==t.length-1) {
			arive=true;
			return;
		}
		
		int v=t[u]/10;
		for(int i=v;i>0;i--) {
			if(u+i>=t.length)continue;
			solve1(u+i);
		}
	}
	
	static void solve2(int u) {
		//System.out.println(u);
		if(u==0) {
			arive=true;
			return;
		}
		
		int v=t[u]/10;
		for(int i=v;i>0;i--) {
			if(u-i<0)continue;
			solve2(u-i);
		}
	}

}

