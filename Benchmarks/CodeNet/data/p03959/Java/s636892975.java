import java.util.*;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n],b=new int[n],min=new int[n],max=new int[n];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.setAll(b,i->s.nextInt());
		Arrays.fill(min,1);
		Arrays.fill(max,Integer.MAX_VALUE);
		for(int i=0;i<n;++i) {
			if(i==0||a[i]!=a[i-1])
				min[i]=max[i]=a[i];
			else
				max[i]=Math.min(max[i],a[i]);
		}
		for(int i=n-1;i>=0;--i) {
			if(i==n-1||b[i]!=b[i+1]) {
				if(min[i]>b[i]||max[i]<b[i]) {
					System.out.println(0);
					return;
				}
				min[i]=max[i]=b[i];
			}else {
				max[i]=Math.min(max[i],b[i]);
			}
		}
		
		long r=1;
		for(int i=0;i<n;++i) {
			r*=Math.max(0,max[i]-min[i]+1);
			r%=1000000007;
		}
		System.out.println(r);
	}
}
