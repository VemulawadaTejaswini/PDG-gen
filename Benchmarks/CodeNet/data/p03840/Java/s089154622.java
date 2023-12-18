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
		int[]in=REPS(7).map(i->s.nextInt()).toArray();
		System.out.println(
				in[0]/2*2
				+in[1]
				+in[3]/2*2
				+in[4]/2*2
				+(in[0]%2)*(in[3]%2)*(in[4]%2)*3
				);
	}
}
