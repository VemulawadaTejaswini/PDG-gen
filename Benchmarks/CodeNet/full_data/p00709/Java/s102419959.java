import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Square Carpets
public class Main{

	int w, h, res, L;
	int[][] a, t;
	boolean[][][] ok;
	Map<String, Integer> ref;
	
	void copy(int[][] a, int[][] b){
		for(int i=0;i<h;i++)for(int j=0;j<w;j++)b[i][j]=a[i][j];
	}
	
	String get(int[][] t){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<h;i++)for(int j=0;j<w;j++)sb.append(t[i][j]);
		return sb.toString();
	}
	
	void dump(){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(a[i][j]==0)System.out.print("-");
				else if(t[i][j]==0)System.out.print("x");
				else System.out.print("o");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void dfs(int step){
		if(res<=step)return;
//		System.out.println("Step:"+step);
//		dump();
		String r = get(t);
		if(ref.containsKey(r)&&ref.get(r)<=step)return;
		ref.put(r, step);
		boolean e = false;
		int[][] p = new int[h][w];
		copy(t, p);
		for(int i=0;i<h;i++)for(int j=0;j<w;j++){
			if(a[i][j]==0||a[i][j]==1&&t[i][j]==1)continue;
			e = true;
			for(int len=L;len>0;len--){
				int max = 0;
				int pi = -1, pj = -1;
				for(int y=i-len+1;y<=i;y++){
					if(y<0||h<=y)continue;
					for(int x=j-len+1;x<=j;x++){
						if(x<0||w<=x)continue;
						if(!ok[y][x][len])continue;
						int cov = 0;
						for(int n=y;n<y+len;n++)for(int m=x;m<x+len;m++){
							if(t[n][m]==0)cov++;
						}
						if(max<cov){
							max = cov; pi = y; pj = x;
						}
					}
				}
				if(max==0)continue;
				for(int n=pi;n<pi+len;n++)for(int m=pj;m<pj+len;m++)t[n][m] = 1;
				dfs(step+1);
				break;
			}
			break;
		}
		if(!e)res = step;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			w = sc.nextInt(); h = sc.nextInt();
			if((w|h)==0)break;
			L = Math.min(h, w);
			a = new int[h][w];
			ok = new boolean[h][w][L+1];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)a[i][j]=sc.nextInt();
			for(int d=1;d<=L;d++)for(int i=0;i+d<=h;i++)for(int j=0;j+d<=w;j++){
				boolean f = true;
				for(int y=i;y<i+d;y++)for(int x=j;x<j+d;x++)if(a[y][x]==0)f = false;
				if(f)ok[i][j][d] = true;
			}
			ref = new HashMap<String, Integer>();
			res = w*h;
			t = new int[h][w];
			dfs(0);
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}