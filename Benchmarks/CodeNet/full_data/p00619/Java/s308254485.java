import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//Kuru-Kuru Robot
public class Main{

	final double EPS = 1e-10;
	
	double dot(double[] a, double[] b){
		return a[0]*b[0]+a[1]*b[1];
	}
	double cross(double[] a, double[] b){
		return a[0]*b[1]-a[1]*b[0];
	}
	double norm(double[] a){
		return Math.sqrt(a[0]*a[0]+a[1]*a[1]);
	}
	double norm(double[] a, double[] b){
		return norm(sub(a, b));
	}
	double[] sub(double[] a, double[] b){
		return new double[]{a[0]-b[0], a[1]-b[1]};
	}
	double ex(double[] a, double[] b, double[] c){
		double[] s1 = sub(b, a), s2 = sub(c, a);
		return cross(s1, s2);
	}
	double angleCos(double[] a, double[] b){
		double na = norm(a), nb = norm(b);
		return Math.acos(dot(a, b)/na/nb);
	}
	boolean crossing(double[] a, double[] b, double[] s, double[] t){
		if(Math.abs(cross(sub(b, a), sub(t, s)))<EPS){
			return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))))<EPS;
		}
		if(ex(a, b, s)*ex(a, b, t)>0)return false;
		if(ex(b, a, s)*ex(b, a, t)>0)return false;
		if(ex(s, t, a)*ex(s, t, b)>0)return false;
		return ex(t, s, a)*ex(t, s, b)<EPS;
	}
	double dist(double[] a, double[] b, double[] p){
		if(dot(sub(b, a), sub(p, a))<EPS)return norm(a, p);
		if(dot(sub(a, b), sub(p, b))<EPS)return norm(b, p);
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	double dist(double[] a, double[] b, double[] s, double[] t){
		if(crossing(a, b, s, t))return 0;
		return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))));
	}
	double distLP(double[] a, double[] b, double[] p){
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	double[] cp(double[] a, double[] b, double[] s, double[] t){
		double ds = distLP(a, b, s), dt = distLP(a, b, t);
		double k = ds/(ds+dt);
		double[] d = sub(t, s);
		return new double[]{s[0]+k*d[0], s[1]+k*d[1]};
	}
	
	@SuppressWarnings("unchecked")
	List<E>[] segmentArrangement(double[][][] seg, List<double[]> resPoint){
		List<double[]> pointList = new ArrayList<double[]>();
		for(int i=0;i<seg.length;i++){
			pointList.add(seg[i][0]); pointList.add(seg[i][1]);
			for(int j=i+1;j<seg.length;j++){
				if(crossing(seg[i][0], seg[i][1], seg[j][0], seg[j][1])){
					pointList.add(cp(seg[i][0], seg[i][1], seg[j][0], seg[j][1]));
				}
			}
		}
		for(int i=0;i<pointList.size();i++){
			boolean col = false;
			for(int j=i+1;j<pointList.size();j++){
				if(norm(pointList.get(i), pointList.get(j)) < EPS){
					col = true; break;
				}
			}
			if(!col)resPoint.add(pointList.get(i));
		}
		int N = resPoint.size();
		List<E>[] resAdj = new List[N];
		for(int i=0;i<N;i++)resAdj[i] = new ArrayList<E>();
		for(int i=0;i<seg.length;i++){
			List<E> tmp = new ArrayList<E>();
			for(int j=0;j<N;j++){
				if(crossing(seg[i][0], seg[i][1], resPoint.get(j), resPoint.get(j))){
					tmp.add(new E(j, norm(seg[i][0], resPoint.get(j))));
				}
			}
			Collections.sort(tmp);
			for(int j=0;j+1<tmp.size();j++){
				E e1 = tmp.get(j), e2 = tmp.get(j+1);
				resAdj[e1.id].add(new E(e2.id, norm(resPoint.get(e1.id), resPoint.get(e2.id))));
				resAdj[e2.id].add(new E(e1.id, norm(resPoint.get(e1.id), resPoint.get(e2.id))));
			}
		}
		return resAdj;
	}

	class E implements Comparable<E>{
		int id;
		double dist;
		public E(int id, double dist) {
			this.id = id;
			this.dist = dist;
		}
		public int compareTo(E o) {
			return (int)Math.signum(dist-o.dist);
		}
	}
	
	double[][] d;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int INF = 1<<29;
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			double[][][] seg = new double[n][2][2];
			for(int i=0;i<n;i++)for(int j=0;j<2;j++)for(int k=0;k<2;k++)seg[i][j][k]=sc.nextDouble();
			double[] S = {sc.nextDouble(), sc.nextDouble()}, G = {sc.nextDouble(), sc.nextDouble()};
			List<double[]> ps = new ArrayList<double[]>();
			List<E>[] adj = segmentArrangement(seg, ps);
			int N = ps.size(), si = -1, gi = -1;
			for(int i=0;i<N;i++){
				if(si==-1 && norm(S, ps.get(i)) < EPS)si = i;
				if(gi==-1 && norm(G, ps.get(i)) < EPS)gi = i;
			}
			d = new double[N][N];
			for(double[] D:d)Arrays.fill(D, INF);
			PriorityQueue<int[]> q = new PriorityQueue<int[]>(N, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return (int)Math.signum(d[o1[0]][o1[1]] - d[o2[0]][o2[1]]);
				}
			});
			for(E e:adj[si]){
				d[e.id][si] = 0;
				q.add(new int[]{e.id, si});
			}
			while(!q.isEmpty()){
				int[] V = q.poll();
				int now = V[0], pre = V[1];
				for(E e:adj[now]){
					double w = d[now][pre] + angleCos(sub(ps.get(now), ps.get(pre)), sub(ps.get(e.id), ps.get(now)))*180/Math.PI;
					if(w < d[e.id][now]){
						d[e.id][now] = w;
						q.add(new int[]{e.id, now});
					}
				}
			}
			double res = INF;
			for(E e:adj[gi])res = Math.min(res, d[gi][e.id]);
			if(res==INF)System.out.println(-1);
			else System.out.printf("%.9f\n", res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}