import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long r=0;
		int[] a=new int[n+1];
		Arrays.setAll(a,i->s.nextInt());
		for(int i=0;i<n;++i){
			int b=s.nextInt(),v=Math.min(b,a[i]+a[i+1]);
			r+=v;
			a[i+1]-=Math.max(0,v-a[i]);
		}
		System.out.println(r);
	}
}
