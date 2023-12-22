import java.util.Arrays;
import java.util.Scanner;

//Legend of Storia
public class Main{
	
	double cross(double[] a, double[] b){
		return a[0]*b[1]-a[1]*b[0];
	}
	double dot(double[] a, double[] b){
		return a[0]*b[0]+a[1]*b[1];
	}
	double[] sub(double[] a, double[] b){
		return new double[]{a[0]-b[0], a[1]-b[1]};
	}
	double[] rot(double[] a, double t){
		return new double[]{a[0]*Math.cos(t)-a[1]*Math.sin(t), a[0]*Math.sin(t)+a[1]*Math.cos(t)};
	}
	double[] rot(double[] a, double[] c, double t){
		double[] s = rot(sub(a, c), t);
		return new double[]{c[0]+s[0], c[1]+s[1]};
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
//		double[][] T = {{1,1},{2,1},{2,2},{1,2}};
//		for(int i=0;i<4;i++){
//			T[i] = rot(T[i], Math.PI/2);
//			System.out.println(T[i][0]+","+T[i][1]);
//		}
//		double[] Z = {0, 0};
		double EPS = 1e-9;
//		double[] C = {1, 1}, P = {2, 1};
//		double[] res = rot(P, C, Math.PI);
//		System.out.println(res[0]+","+res[1]);
		for(;;){
			int n = sc.nextInt(), R = sc.nextInt(), Q = sc.nextInt();
			if((n|R|Q)==0)break;
			double[][] p = new double[n][2];
			for(int i=0;i<n;i++)for(int j=0;j<2;j++)p[i][j]=sc.nextDouble();
			int c = -1;
			for(int i=0;i<n;i++)if(Math.abs(R-Math.hypot(p[i][0], p[i][1]))<EPS){
				c = i; break;
			}
			while(Q--!=0){
				double max = 0, thita = 0;
				int id = -1;
				for(int i=0;i<n;i++){
					if(c==i)continue;
					double r = Math.hypot(p[i][0]-p[c][0], p[i][1]-p[c][1]);
					if(r<max)continue;
					double dt = Math.acos((2*R*R-r*r)/(2*R*R));
					double[] pos = rot(p[c], 2*Math.PI-dt);
//					debug(pos);
					double[] s1 = sub(p[i], p[c]), s2 = sub(pos, p[c]);
					double ang = Math.atan2(cross(s1, s2), dot(s1, s2));
//					double ang = Math.acos(r/2/R);
//					double[] d = rot(sub(Z, p[c]), ang);
//					double norm = Math.hypot(d[0], d[1]);
//					d[0] = d[0]/norm*r; d[1] = d[1]/norm*r;
//					d[0]+=p[c][0]; d[1]+=p[c][1];
//					
//					System.out.println(d[0]+","+d[1]+" "+Math.hypot(d[0], d[1]));
//					
//					System.out.println(Math.abs(R-Math.hypot(d[0], d[1]))<EPS);
//					
//					double[] s1 = sub(p[i], p[c]), s2 = sub(d, p[c]);
//					ang = Math.atan2(cross(s1, s2), dot(s1, s2));
//					debug(ang);
					boolean ok = true;
					for(int j=0;j<n;j++){
						if(j==c)continue;
						double[] b = rot(p[j], p[c], ang);
//						System.out.println("B: " + b[0]+","+b[1] + " ID:"+j);
						if(b[0]*b[0]+b[1]*b[1]>R*R)ok = false;
					}
					if(ok){
						id = i; max = r; thita = ang;
					}
				}
//				System.out.println("C:"+c+" thita:"+thita);
				for(int i=0;i<n;i++){
					if(i==c)continue;
					p[i] = rot(p[i], p[c], thita);
				}
//				debug(p);
				c = id;
				System.out.printf("%.9f %.9f\n", p[c][0], p[c][1]);
			}
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}