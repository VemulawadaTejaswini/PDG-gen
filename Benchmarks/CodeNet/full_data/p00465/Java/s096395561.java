import java.util.PriorityQueue;
import java.util.Scanner;

//Authentication Level
public class Main{

	class R implements Comparable<R>{
		int i,j,l,k;
		public R(int i, int j, int l, int k) {
			this.i = i;
			this.j = j;
			this.l = l;
			this.k = k;
		}
		public int compareTo(R o) {
			return l-o.l;
		}
	}

	PriorityQueue<R> q;
	int w1, h1, w2, h2;
	int[][] m1, m2;
	int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
	int level1, level2;
	int c1, c2;
	int[][] a1, a2;

	void f1(int i, int j){
		if(m1[i][j]==0)return;
		if(level1<m1[i][j]){
			q.add(new R(i,j,m1[i][j],1));
			return;
		}
		m1[i][j] = 0;
		c1++;
		for(int k=0;k<4;k++){
			int ni = i+move[k][0];
			int nj = j+move[k][1];
			if(0<=ni&&ni<h1&&0<=nj&&nj<w1)f1(ni,nj);
		}
	}

	void f2(int i, int j){
		if(m2[i][j]==0)return;
		if(level2<m2[i][j]){
			q.add(new R(i,j,m2[i][j],2));
			return;
		}
		m2[i][j] = 0;
		c2++;
		for(int k=0;k<4;k++){
			int ni = i+move[k][0];
			int nj = j+move[k][1];
			if(0<=ni&&ni<h2&&0<=nj&&nj<w2)f2(ni,nj);
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int r = sc.nextInt();
			if(r==0)break;
			w1 = sc.nextInt();
			h1 = sc.nextInt();
			m1 = new int[h1][w1];
			int j1 = sc.nextInt()-1;
			int i1 = sc.nextInt()-1;
			for(int i=0;i<h1;i++)for(int j=0;j<w1;j++)m1[i][j]=sc.nextInt();
			w2 = sc.nextInt();
			h2 = sc.nextInt();
			m2 = new int[h2][w2];
			int j2 = sc.nextInt()-1;
			int i2 = sc.nextInt()-1;
			for(int i=0;i<h2;i++)for(int j=0;j<w2;j++)m2[i][j]=sc.nextInt();
			q = new PriorityQueue<R>();
			level1 = level2 = c1 = c2 = 0;
			q.add(new R(i1,j1,1,1));
			q.add(new R(i2,j2,1,2));
			a1 = new int[h1*w1+2][2];
			a2 = new int[h2*w2+2][2];
			int k1, k2;
			k1 = k2 = 1;
			while(true){
				R v = q.poll();
//				System.out.println("K1:" + k1 + " K2:" + k2 + " A1:" + a1.length + " A2:" + a2.length);
				if(v.k==1){
					level1 = v.l;
					f1(v.i, v.j);
					a1[k1][0] = level1;
					a1[k1][1] = c1;
					k1++;
					if(r<=c1+c2){
						k2--;
						while(0<=k2){
							if(r>c1+a2[k2][1])break;
							level2 = a2[k2][0];
							k2--;
						}
					}
				}
				else{
					level2 = v.l;
					f2(v.i, v.j);
					a2[k2][0] = level2;
					a2[k2][1] = c2;
					k2++;
					if(r<=c1+c2){
						k1--;
						while(0<=k1){
							if(r>a1[k1][1]+c2)break;
							level1 = a1[k1][0];
							k1--;
						}
					}
				}
				if(r<=c1+c2){
					break;
				}
			}
			System.out.println(level1+level2);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}