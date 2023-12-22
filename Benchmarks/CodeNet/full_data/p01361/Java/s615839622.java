import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int hp0, hpMax;
	int w, h;
	char[][] map;
	int nDamages;
	HashMap<Character, Integer> damages;
	int nDirections;
	LinkedList<P> directions;
	int nPostions;
	int[] potions;

	class P{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

	void run(){
		for(;;){
			hp0=sc.nextInt();
			hpMax=sc.nextInt();
			if((hp0|hpMax)==0){
				break;
			}
			h=sc.nextInt();
			w=sc.nextInt();
			map=new char[h][w];
			for(int j=0; j<h; j++){
				String s=sc.next();
				for(int i=0; i<w; i++){
					map[j][i]=s.charAt(i);
				}
			}
			nDamages=sc.nextInt();
			damages=new HashMap<Character, Integer>();
			for(int i=0; i<nDamages; i++){
				char c=sc.next().charAt(0);
				int d=sc.nextInt();
				damages.put(c, d);
			}
			nDirections=sc.nextInt();
			directions=new LinkedList<P>();
			for(int i=0; i<nDirections; i++){
				char c=sc.next().charAt(0);
				int dx=0, dy=0;
				switch(c){
				case 'U':
					dy=-1;
					break;
				case 'D':
					dy=1;
					break;
				case 'L':
					dx=-1;
					break;
				case 'R':
					dx=1;
					break;
				}
				for(int k=sc.nextInt(); k>0; k--){
					directions.addLast(new P(dx, dy));
				}
			}
			nDirections=directions.size();
			nPostions=sc.nextInt();
			potions=new int[nPostions];
			for(int i=0; i<nPostions; i++){
				potions[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int x=0, y=0;
		// 0:unused
		// 1:used
		int[][] dp;
		dp=new int[nDirections+1][1<<nPostions];
		dp[0][0]=hp0;

		for(int i=0; i<=nDirections; i++){
			int damage=damages.get(map[y][x]);
			for(int s=0; s<1<<nPostions; s++){
				if(dp[i][s]<=0){
					continue;
				}
				for(int t=0; t<nPostions; t++){
					if((s>>t&1)==0){
						int hp=Math.min(hpMax, dp[i][s]+potions[t]);
						int u=1<<t;
						dp[i][s|u]=Math.max(dp[i][s|u], hp);
					}
				}
			}
			for(int s=0; s<1<<nPostions; s++){
				dp[i][s]-=damage;
			}
			if(i==nDirections){
				break;
			}
			System.arraycopy(dp[i], 0, dp[i+1], 0, 1<<nPostions);
			P p=directions.get(i);
			x+=p.x;
			y+=p.y;
		}
		boolean f=false;
		for(int i=0; i<1<<nPostions; i++){
			if(dp[nDirections][i]>0){
				f=true;
			}
		}
		println(f?"YES":"NO");
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}