import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		int[]c=new int[18];
		long r=1;
		for(int i=0;i<n;++i) {
			++c[a[i]];
			if(a[i]>0) {
				r*=c[a[i]-1]-c[a[i]]+1;
			}else {
				r*=4-c[a[i]];
			}
			r%=1000000007;
			//System.err.println(Arrays.toString(c));
			//System.err.println(r);
		}
		System.out.println(r);
	}
}
