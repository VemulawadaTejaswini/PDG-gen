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
		int n,p;
		while((n=s.nextInt())+(p=s.nextInt())!=0){
			int pl[]=new int[n],st=p,i=0;
			while(pl[i]!=p){
				if(st>0) {
					st--;
					pl[i]++;
				}else {
					st=pl[i];
					pl[i]=0;
				}
				i=(i+1)%n;
			}
			System.out.println(i);
		}
	}
}