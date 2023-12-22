import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.function.LongSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static final long[] fal_rnd(long[] ar,LongSupplier sp){
		int l=-1,r=ar.length;
		while(l+1!=r)
			ar[Math.random()<0.5?++l:--r]=sp.getAsLong();
		return ar;
	}
	static final IntStream REPS(int v){return IntStream.range(0, v);};
	public static void main(String[] __){
		cases:
		while (true) {
			final int n=s.nextInt(),a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),x=s.nextInt();
			if(n+a+b+c+x==0) return;
			final ArrayDeque<Integer> in=REPS(n).mapToObj(v->s.nextInt()).collect(Collectors.toCollection(ArrayDeque<Integer>::new));
			final int[]rnd=IntStream.iterate(x,v->(a*v+b)%c).limit(10001).toArray();
			for(int i=0;i<=10000;i++){
				if(in.peekFirst()==rnd[i])
					in.pollFirst();
				if(in.isEmpty()) {
					System.out.println(i);
					continue cases;
				}
			}
			System.out.println(-1);
		}
	}
}