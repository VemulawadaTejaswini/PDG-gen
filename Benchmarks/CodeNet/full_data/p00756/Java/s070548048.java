import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	final int INF = 1 << 24;
	int [] x,y,r,c;
	boolean [] used;
	
	private void doit(){
		Scanner sc = new Scanner (System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			x = new int[n];
			y = new int[n];
			r = new int[n];
			c = new int[n];
			used = new boolean[n];
			for(int i=0; i < n; i++){
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				r[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			int len = 1 << n;
			boolean [][] dp = new boolean[len][n+1];
			dp[0][0] = true;
			int ans = 0;
			for(int i=0; i < n;i+=2){
				for(int j = 0; j < len; j++){
					if(dp[j][i] == false) continue;
					
					for(int k = 0; k < n; k++){
						if((j & (1 << k)) != 0) continue;
						for(int l = k+1; l < n; l++){
							if((j & (1 << k)) != 0) continue;
							if(! issameC(k,l)) continue;
							if(isOVL(k) || isOVL(l)) continue;
							int num;
							int kInd = 1 << k;
							int lInd = 1 << l;
							used[k] = true;
							used[l] = true;
							num = j | kInd;
							num = num | lInd;
							//System.out.println("num= "+num + " j= " + j +  " k = "+ k + " l= " + l );
							dp[num][i+2] = true;
							ans = i+2;
						}
					}
				}
			}
//			//TODO debug
//			for(int i= 0; i < len; i++){
//				for(int j = 0; j < n+1; j++){
//					if(dp[i][j]){
//						System.out.print("1 ");
//					}
//					else{
//						System.out.print("0 ");
//					}
//				}
//				System.out.println();
//			}
			//System.out.print("ANS= ");
			System.out.println(ans);
		}
	}
	
	private boolean isOVL(int a) {
		if(a == 0) return false;
		int ax = x[a];
		int ay = y[a];
		int ar= r[a];
		for(int i = a-1; i >= 0; i--){
			if(used[i]) continue;
			int ix = x[i];
			int iy = y[i];
			int ir = r[i];
			double dis = Point2D.Double.distance(ax, ay, ix, iy);
			int rr = ir + ar;
			if(dis < rr)return true;
		}
		return false;
	}

	private boolean issameC(int a, int b) {
		if(c[a] == c[b]) return true;
		return false;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}