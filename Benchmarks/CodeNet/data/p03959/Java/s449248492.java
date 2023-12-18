import java.util.*;

class Main{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[]a=new int[n],b=new int[n],min=new int[n],max=new int[n];
	
	public static void main(String[]$){
		new Main().main();
	}
	void main() {
		Arrays.setAll(a,i->s.nextInt());
		Arrays.setAll(b,i->s.nextInt());
		Arrays.fill(min,1);
		Arrays.fill(max,Integer.MAX_VALUE);
		
		if(f(a,0,n,1)*f(b,n-1,-1,-1)==0) {
			System.out.println(0);
			return;
		}
		
		long r=1;
		for(int i=0;i<n;++i) {
			r*=Math.max(0,max[i]-min[i]+1);
			r%=1000000007;
		}
		System.out.println(r);
	}
	int f(int[]b,int f,int t,int d) {
		for(int i=f;i!=t;i+=d) {
			if(i==f||b[i]!=b[i-d]) {
				if(min[i]>b[i]||max[i]<b[i])
					return 0;
				min[i]=max[i]=b[i];
			}else {
				max[i]=Math.min(max[i],b[i]);
			}
		}
		return 1;
	}
}
