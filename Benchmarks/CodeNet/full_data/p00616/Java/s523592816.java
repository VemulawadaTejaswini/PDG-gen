
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void debug(Object...os){
		System.err.println(deepToString(os));
	}
	class E{
		int x,y,z;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + x;
			result = prime * result + y;
			result = prime * result + z;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			E other = (E) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			if (z != other.z)
				return false;
			return true;
		}

		private Main getOuterType() {
			return Main.this;
		}

		public E(int x, int y, int z) {
			super();
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			int h=sc.nextInt();
			if(n==0 && h==0)return;
			HashSet<E> set=new HashSet<E>();
			for(int l=0;l<h;l++){
				String s=sc.next();
				if(s.equals("xy")){
					int x=sc.nextInt()-1,y=sc.nextInt()-1;
					for(int i=0;i<n;i++){
						set.add(new E(x,y,i));
					}
				}
				if(s.equals("xz")){
					int x=sc.nextInt()-1,y=sc.nextInt()-1;
					for(int i=0;i<n;i++){
						set.add(new E(x,i,y));
//						bs[x][i][y]=true;
					}
				}
				if(s.equals("yz")){
					int x=sc.nextInt()-1,y=sc.nextInt()-1;
					for(int i=0;i<n;i++){
						set.add(new E(i,x,y));
//						bs[i][x][y]=true;
					}
				}
			}
//			int res=0;
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					for (int j2 = 0; j2 < n; j2++) {
//						if(!bs[i][j][j2])res++;
//					}
//				}
//			}
			System.out.println(n*n*n-set.size());
		}
	}
}