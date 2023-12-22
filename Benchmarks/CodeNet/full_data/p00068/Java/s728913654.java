import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc;
	
	class Vector{
		public double x,y;
		
		Vector sub(Vector a){
			return new Vector(x-a.x,y-a.y);
		}
		double op(Vector a){
			return x*a.y-y*a.x;
		}
	
		double ip(Vector a){
			return x*a.x+y*a.y;
		}
		
		double norm(){
			return Math.sqrt(x*x+y*y);
		}
		
		public Vector(double x,double y){
			this.x=x;
			this.y=y;
		}
	}
	class VectorComparator implements Comparator<Vector>{
		@Override
		public int compare(Vector o1, Vector o2) {
			// TODO Auto-generated method stub
			double sign=o1.y-o2.y;
			if(sign==0)sign=(o1.x-o2.x);
			return (int)Math.signum(sign);
		}
	}
	
	int solve(LinkedList<Vector> coords){
		Collections.sort(coords,new VectorComparator());
		Vector p0=coords.getFirst(),p=p0;
		Vector v=new Vector(1,0);

		do{
			double cosmax=-1;
			Vector qmax=null;
			for(Vector q:coords){
				double cos;
				Vector u=q.sub(p);
				cos=v.ip(u)/(v.norm()*u.norm());
				if(v.op(u)>=0&&cos>cosmax){
					cosmax=cos;
					qmax=q;
				}
			}
			v=qmax.sub(p);
			p=qmax;
			coords.remove(p);
		}while(p!=p0);
		return coords.size();
	}
	
	double nd(){
		return sc.nextDouble();
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in).useDelimiter(",|\r\n|\n");
		LinkedList<Vector> coords=new LinkedList<Vector>();
		
		int n;
		while((n=ni())!=0){
			for(int i=0;i<n;++i){
				coords.add(new Vector(nd(),nd()));
			}
			System.out.println(solve(coords));
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}
}