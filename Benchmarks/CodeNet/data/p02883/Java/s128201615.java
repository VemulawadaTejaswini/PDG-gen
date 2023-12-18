import java.util.*;
import java.util.stream.*;



class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long k=s.nextLong();
		int[] a=new int[n];
		int[] b=new int[n];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.setAll(b,i->s.nextInt());
		Arrays.sort(a);
		Arrays.sort(b);

//		System.err.println(k);
//		System.err.println(Arrays.toString(a));
//		System.err.println(Arrays.toString(b));

		long ng=-1,ok=IntStream.range(0,n).mapToLong(i->a[i]*b[n-i-1]).max().getAsLong();

		while(Math.abs(ok-ng)>1){
			long mid=(ok+ng)/2;

			int r=0;
			for(int i=0;i<n;++i){
				int v=a[n-1-i]*b[i];
				r+=mid>=v?0:(v-mid+b[i]-1)/b[i];
			}

			//System.err.println(ok+" "+ng+" "+mid+" "+r);

			if(r<=k)
				ok=mid;
			else
				ng=mid;
		}

		System.out.println(ok);
	}
}