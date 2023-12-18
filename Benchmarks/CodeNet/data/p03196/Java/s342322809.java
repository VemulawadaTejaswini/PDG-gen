import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gint() {return Integer.parseInt(s.next());};
	public static void main(String[] $){
		long n=s.nextLong();
		long m=s.nextLong();
		
		if(n==1) {
			System.out.println(m);
			return;
		}
		
		long r=1;
		
		for(long i=2;i*i<=m;++i) {
			int c=0;
			while(m%i==0) {
				++c;
				m/=i;
			}
			if(c/n>0)
				r*=c/n*i;
		}
		System.out.println(r);
	}
}
