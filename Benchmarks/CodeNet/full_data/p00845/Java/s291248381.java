import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		new AOJ1266();
	}
	
	class AOJ1266{
		int N;
		final double EPS=1.0e-8;
		AOJ1266(){
			while(true){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		class Point3D{
			double x,y,z;
			Point3D(double x,double y,double z){
				this.x=x;	this.y=y;	this.z=z;
			}
		}
		double dot3D(Point3D a,Point3D b){
			return a.x*b.x + a.y*b.y + a.z*b.z;
		}
		double norm3D(Point3D a){
			return a.x*a.x + a.y*a.y + a.z*a.z;
		}
		double abs3D(Point3D a){
			return Math.sqrt(norm3D(a));
		}
		double angleR3D(Point3D a,Point3D b){
			return Math.acos(dot3D(a,b) / (abs3D(a)*abs3D(b)));
		}
		void solve(){
			Point3D[] stars=new Point3D[N];
			for(int i=0; i<N; ++i)	stars[i]=new Point3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			int M=sc.nextInt();
			Point3D[] scopes=new Point3D[M];
			double[] vs=new double[M];
			for(int i=0; i<M; ++i){
				scopes[i] = new Point3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
				vs[i]=sc.nextDouble();
			}
			HashSet<Integer> ans=new HashSet<Integer>();
			for(int i=0; i<M; ++i){
				for(int j=0; j<N; ++j){
					if(vs[i]+EPS > angleR3D(scopes[i], stars[j]))	ans.add(j);
				}
			}
			System.out.println(ans.size());
		}
	}
}