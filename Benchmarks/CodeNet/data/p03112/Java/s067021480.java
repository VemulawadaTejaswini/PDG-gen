import java.util.*;
import java.util.stream.*;

public class Main{
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),q=s.nextInt();
		long[]a=new long[n+2],b=new long[m+2];
		for(int i=1;i<=n;++i)
			a[i]=s.nextLong();
		for(int i=1;i<=m;++i)
			b[i]=s.nextLong();
		a[0]=b[0]=-40_000_000_000L;
		a[n+1]=b[m+1]=40_000_000_000L;
//		System.err.println(Arrays.toString(a));
//		System.err.println(Arrays.toString(b));
		for(int p=0;p<q;++p){
			long v=s.nextLong();
			int ab=~Arrays.binarySearch(a,v);
			int bb=~Arrays.binarySearch(b,v);

			long al=a[ab-1],ar=a[ab];
			long bl=b[bb-1],br=b[bb];
			System.out.println(
					LongStream.of(
							f(v,al,bl,br),
							f(v,ar,bl,br),
							f(v,bl,al,ar),
							f(v,br,al,ar)
					).min().getAsLong()
			);
		}
	}
	private static long f(long v,long w,long... e){
		return Math.abs(v-w)+Arrays.stream(e).map(i->Math.abs(w-i)).min().getAsLong();
	}
}