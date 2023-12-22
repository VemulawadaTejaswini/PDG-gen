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
	static final IntStream REPS(int v){return IntStream.range(0, v);};
	public static void main(String[] __){
		while (true) {
			String in=s.next();
			if(in.equals("#")) return;
			int c=0;
			boolean b="yuiophjklnm".indexOf(in.charAt(0))>=0;
			for(int i=1;i<in.length();i++) {
				boolean bb="yuiophjklnm".indexOf(in.charAt(i))>=0;
				if(b^bb) c++;
				b=bb;
			}
			System.out.println(c);
		}
	}
}