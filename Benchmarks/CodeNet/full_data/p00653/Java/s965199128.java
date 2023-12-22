import java.util.Arrays;
import java.util.Scanner;

//School of Killifish
public class Main{

	int r, c, yn, xn;
	SegY[] segy;

	class SegY{
		int id;
		int[] segx;
		public SegY(int id) {
			this.id = id;
			segx = new int[2*xn-1];
			Arrays.fill(segx, Integer.MAX_VALUE);
		}
		void update(int[] x, int ID){
			int n = x.length;
			for(int i=0;i<n;i++){
				int k = xn-1+i;
				//				System.out.println("UPDATE: " + k + " value:" + x[i]);
				segx[k] = x[i];
				while(k>0){
					k=(k-1)/2;
					segx[k] = Math.min(segx[2*k+1], segx[2*k+2]);
				}
			}
			int k = yn-1+ID;
			while(k>0){
				k=(k-1)/2;
				for(int i=0;i<segx.length;i++)segy[k].segx[i] = Math.min(segy[2*k+1].segx[i], segy[2*k+2].segx[i]);
			}
		}
		void dump(){
			int p2 = 1;
			int id = 0;
			for(int i=0;i<segx.length;i++){
				System.out.print(segx[i]+" ");
				if(i==id){
					System.out.println();
					p2*=2;
					id+=p2;
				}
			}
		}
		int xquery(int x1, int x2, int k, int l, int r){
			int res = 0;
			if(x2<=l||r<=x1)res = Integer.MAX_VALUE;
			else if(x1<=l&&r<=x2)res = segx[k];
			else{
				int vl = xquery(x1, x2, 2*k+1, l, (l+r)/2);
				int vr = xquery(x1, x2, 2*k+2, (l+r)/2, r);
				res = Math.min(vl, vr);
			}
			return res;
		}
	}

	int query(int y1, int y2, int x1, int x2, int k, int l, int r){
		int res = 0;
		if(y2<=l||r<=y1)res = Integer.MAX_VALUE;
		else if(y1<=l&&r<=y2)res = segy[k].xquery(x1, x2, 0, 0, xn);
		else {
			int vl = query(y1, y2, x1, x2, 2*k+1, l, (l+r)/2);
			int vr = query(y1, y2, x1, x2, 2*k+2, (l+r)/2, r);
			res = Math.min(vl, vr);
		}
//		System.out.println("Y-Query: [" + y1 + "," + y2+") K:" + k + " L:" + l  +" R:" + r + " REST:" + res);
		return res;
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			r = sc.nextInt();
			c = sc.nextInt();
			int q = sc.nextInt();
			if((r|c|q)==0)break;
			int[][] a = new int[r][c];
			for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=sc.nextInt();
			yn = 1;while(yn<r)yn*=2;
			xn = 1;while(xn<c)xn*=2;
			segy = new SegY[2*yn-1];
			for(int i=0;i<segy.length;i++)segy[i]=new SegY(i);
			for(int i=0;i<r;i++){
				segy[yn-1+i].update(a[i], i);
			}
			while(q--!=0){
				//				int x1 = sc.nextInt();
				//				int x2 = sc.nextInt();
				//				segy[0].dump();
				//				System.out.println(segy[0].xquery(x1, x2, 0, 0, xn));
				int y1 = sc.nextInt();
				int x1 = sc.nextInt();
				int y2 = sc.nextInt();
				int x2 = sc.nextInt();
				System.out.println(query(y1, y2+1, x1, x2+1, 0, 0, yn));
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}