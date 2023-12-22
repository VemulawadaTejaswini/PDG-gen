import java.util.*;

public class Main {
	int n, k;
	ArrayList<Integer> x, y, z;
	int[][] in;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		x = new ArrayList<Integer>();
		y = new ArrayList<Integer>();
		z = new ArrayList<Integer>();
		in = new int[n][6];
		for(int i=0;i<n;i++){
			for(int j=0;j<6;j++){
				in[i][j] = sc.nextInt();
				if(j%3==0 && !x.contains(in[i][j])) x.add(in[i][j]);
				else if(j%3==1 && !y.contains(in[i][j])) y.add(in[i][j]);
				else if(j%3==2 && !z.contains(in[i][j])) z.add(in[i][j]);
			}
		}
		Collections.sort(x);
		Collections.sort(y);
		Collections.sort(z);
		
		int xc = x.size();
		int yc = y.size();
		int zc = z.size();
		long[][][] cnt = new long[zc][yc][xc];
		
		for(int i=0;i<n;i++){
			int x1 = x.indexOf(in[i][0]);
			int y1 = y.indexOf(in[i][1]);
			int z1 = z.indexOf(in[i][2]);
			int x2 = x.indexOf(in[i][3]);
			int y2 = y.indexOf(in[i][4]);
			int z2 = z.indexOf(in[i][5]);
			for(int j=i;j<n;j++){
				int x3 = x.indexOf(in[j][0]);
				int y3 = y.indexOf(in[j][1]);
				int z3 = z.indexOf(in[j][2]);
				int x4 = x.indexOf(in[j][3]);
				int y4 = y.indexOf(in[j][4]);
				int z4 = z.indexOf(in[j][5]);
				
				if(x2<=x3 || x4<=x1) break;
				if(y2<=y3 || y4<=y1) break;
				if(z2<=z3 || z4<=z1) break;
				int left = Math.max(x1, x3);
				int right = Math.min(x2, x4);
				int up = Math.max(y1, y3);
				int dwn = Math.min(y2, y4);
				int top = Math.max(z1, z3);
				int btm = Math.min(z2, z4);
				
				for(int a=top;a<btm;a++){
					for(int b=up;b<dwn;b++){
						for(int c=left;c<right;c++){
							cnt[a][b][c]++;
						}
					}
				}
			}
		}
		
		long ans = 0;
		for(int i=0;i<zc-1;i++){
			for(int j=0;j<yc-1;j++){
				for(int s=0;s<xc-1;s++){
					if(cnt[i][j][s]>=k){
						long xx = x.get(s+1)-x.get(s);
						long yy = y.get(j+1)-y.get(j);
						long zz = z.get(i+1)-z.get(i);
						ans += xx*yy*zz;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}	
}