import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static int[] color;
	public static int[] state;
	public static int[] cnum;
	public static int n;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			n = in.nextInt();
			if(n == 0) return;
			Circle[] cir = new Circle[n];
			color = new int[4];
			state = new int[n];
			cnum = new int[4];
			for(int i=0; i<n; i++){
				cir[i] = new Circle(in.nextInt()
						, in.nextInt()
						, in.nextInt()
						, in.nextInt()-1);
				color[cir[i].color] |= 1<<i;
				cnum[cir[i].color]++;
				for(int j=0; j<i; j++){
					if(cir[i].cross(cir[j])) state[i] |= 1<<j;
				}
			}
			res = n;
			set = new HashSet<Integer>();
			dfs((1<<n)-1);
			System.out.println(n-res);
		}
	}
	
	public static HashSet<Integer> set;
	public static int res;
	public static void dfs(int all){
		if(set.contains(all)) return;
		set.add(all);
		res = Math.min(res, Integer.bitCount(all));
		for(int i=0; i<4; i++){
			int col = color[i] & all;
			if(Integer.bitCount(col) < 2) continue;
			for(int j=1, i1=0; i1<n; i1++,j<<=1){
				if((col&j) == 0 || (state[i1]&all) > 0) continue;
				for(int k=j<<1, i2=i1+1; i2<n; i2++,k<<=1){
					if((col&k) == 0 || (state[i2]&all) > 0) continue;
					dfs(all&~j&~k);
				}
			}
		}
	}
}

class Circle{
	int x, y, r;
	int color;
	public Circle(int x, int y, int r, int color){
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}
	
	public boolean cross(Circle c){
		return sq(x-c.x)+sq(y-c.y) < sq(r+c.r);
	}
	
	public int sq(int a){
		return a*a;
	}
}