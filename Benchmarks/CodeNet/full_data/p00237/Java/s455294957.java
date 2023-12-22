import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//The Last Door
public class Main{

	int N, D;
	double EPS = 1e-2;
	double[][][] p;
	double[][] d;
	int[] top;
	int[][] bottom;
	
	boolean[][] e;
	int[] deg;
	boolean[] light;
	
	void lighting(int v){
		if(light[v])return;
		light[v] = true;
		for(int i=0;i<N;i++)if(e[v][i])lighting(i);
	}
	
	boolean hit(int a, int b){
		double[] b1 = p[a][bottom[a][0]], b2 = p[a][bottom[a][1]];
		double[] p1 = new double[]{b1[0]+d[a][0], b1[1]+d[a][1]};
		double[] p2 = new double[]{b2[0]+d[a][0], b2[1]+d[a][1]};
		double area = norm(b1, b2)*D;
		for(int j=0;j<3;j++){
			double s = 0;
			s += area(b1, b2, p[b][j]) + area(b2, p2, p[b][j]) + area(p2, p1, p[b][j]) + area(p1, b1, p[b][j]);
			if(Math.abs(s-area)<1e-8)return true;
		}
		for(int j=0;j<3;j++){
			if(dist(b1, b2, p[b][j])<=EPS)return true;
			if(dist(b2, p2, p[b][j])<=EPS)return true;
			if(dist(p2, p1, p[b][j])<=EPS)return true;
			if(dist(p1, b1, p[b][j])<=EPS)return true;
		}
		return false;
	}
	double dist(double[] a, double[] b, double[] p){
		if(dot(sub(b, a), sub(p, a))<1e-8)return norm(a, p);
		if(dot(sub(a, b), sub(p, b))<1e-8)return norm(b, p);
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	double dot(double[] a, double[] b){
		return a[0]*b[0]+a[1]*b[1];
	}
	double norm(double[] a, double[] b){
		return Math.hypot(a[0]-b[0], a[1]-b[1]);
	}
	int comp(double[] a, double[] b){
		if(a[0]==b[0])return (int)Math.signum(a[1]-b[1]);
		return (int)Math.signum(a[0]-b[0]);
	}
	double[] sub(double[] a, double[] b){
		return new double[]{a[0]-b[0], a[1]-b[1]};
	}
	double[] mid(double[] a, double[] b){
		return new double[]{(a[0]+b[0])/2, (a[1]+b[1])/2};
	}
	double cross(double[] a, double[] b){
		return a[0]*b[1]-a[1]*b[0];
	}
	double area(double[] a, double[] b, double[] c){
		double res = cross(a, b)+cross(b, c)+cross(c, a);
		return Math.abs(res)/2;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			N = sc.nextInt(); D = sc.nextInt();
			if((N|D)==0)break;
			p = new double[N][3][2];
			d = new double[N][2];
			top = new int[N];
			bottom = new int[N][2];
			for(int i=0;i<N;i++){
				for(int j=0;j<3;j++)for(int k=0;k<2;k++)p[i][j][k] = sc.nextDouble();
				for(int j=0;j<3;j++){
					if(Math.abs(norm(p[i][j], p[i][(j+1)%3])-norm(p[i][j], p[i][(j+2)%2]))<1e-8){
						top[i] = j;
						bottom[i][0] = (j+1)%3; bottom[i][1] = (j+2)%3;
						double[] m = mid(p[i][(j+1)%3], p[i][(j+2)%3]);
						d[i] = sub(p[i][j], m);
						double nor = Math.hypot(d[i][0], d[i][1]);
						d[i][0]/=nor; d[i][1]/=nor;
						d[i][0]*=D; d[i][1]*=D;
						break;
					}
				}
			}
			deg = new int[N];
			e = new boolean[N][N];
			for(int i=0;i<N;i++)for(int j=0;j<N;j++){
				if(i==j)continue;
				e[i][j] = hit(i, j);
				if(e[i][j])deg[j]++;
			}
			int res = 0;
			light = new boolean[N];
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(N, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return deg[o1]-deg[o2];
				}
			});
			for(int i=0;i<N;i++)q.add(i);
			while(!q.isEmpty()){
				int v = q.poll();
				if(light[v])continue;
				res++;
				lighting(v);
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}