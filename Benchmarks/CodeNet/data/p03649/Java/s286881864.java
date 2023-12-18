import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int n=getInt();

		long[]a=REPS(n).mapToLong(i->s.nextLong()).toArray(),dec=new long[n];

		long decsumlast=0,r=0,max=Long.MAX_VALUE;

		while(max+decsumlast>=n){
			max=0;
			long decsum=0;
			for(int i=0;i<n;++i) {
				a[i]+=decsumlast-dec[i];
				r+=a[i]/n;
				decsum+=a[i]/n;
				dec[i]=a[i]/n;
				a[i]%=n;

				max=Math.max(max,a[i]);
			}
			decsumlast=decsum;
//			System.out.println(max);
//			System.out.println(Arrays.toString(a));
		}

		System.out.println(r);
	}
}
