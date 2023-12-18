import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $) {
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int[]a=new int[n];
		int[]b=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		//System.err.println(Arrays.toString(a));

		for(int c=0;c<2;++c) {
			for(int i=0;i<n;++i) {
				int h=(i+n-1)%n;
				int j=(i+1)%n;
				if(a[h]<a[i]&&a[i]>a[j]) {
					int v=a[i]-Math.max(a[h],a[j]);
					a[h]-=v;
					a[i]-=v*2;
					a[j]-=v;
					b[i]+=v*2;
					b[j]+=v*2;
				}
				if(a[h]<a[i]&&a[i]==a[j]) {
					int v=a[i]-a[h];
					a[i]-=v;
					a[j]-=v;
					b[j]+=v*2;
				}
			}
		}

		//System.err.println();
		//System.err.println(Arrays.toString(a));
		//System.err.println(Arrays.toString(b));

		int t=a[0];
		System.out.println(Arrays.stream(b).mapToObj(i->String.valueOf(i+t)).collect(Collectors.joining(" ")));;
	}
}
