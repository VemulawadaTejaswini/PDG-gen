import java.util.Arrays;
import java.util.Scanner;
import java.util.function.LongSupplier;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static final long[] fal_rnd(long[] ar,LongSupplier sp){
		int l=-1,r=ar.length;
		while(l+1!=r)
			ar[Math.random()<0.5?++l:--r]=sp.getAsLong();
		return ar;
	}
	static final IntStream REPS(int v){
		return IntStream.range(0,v);
	};
	public static void main(String[] __){
		int n=s.nextInt(),m=s.nextInt();
		int[] r=new int[n];
		for(int i=0;i<m;i++) {
			
			int a=s.nextInt(),b=s.nextInt();
			if(a>b) {
				final int buf=a;
				a=b;
				b=buf;
			}
			r[a-1]++;
			if(b!=n)
				r[b-1]--;
		}
		Arrays.parallelPrefix(r,Integer::sum);
		
		System.out.println(
				Arrays.stream(r).parallel().anyMatch(i->i%2==1)?"NO":"YES");
	}
}
