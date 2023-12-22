import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] __){
		while(true){
			int n=s.nextInt();
			if(n==0)return;
			
			int[][] in=new int[n][];
			for(int i=0;i<n;i++) {
				in[i]=IntStream.range(0,s.nextInt()).map(o->s.nextInt()).toArray();
			}
			BitSet list=new BitSet(n);
			IntStream.range(0,s.nextInt()).map(o->s.nextInt()).forEach(list::set);
			
			int r=-1;
			for(int i=0;i<n;i++) {
				BitSet clone=(BitSet)list.clone();
				Arrays.stream(in[i]).forEach(clone::clear);
				if(clone.isEmpty()) {
					if(r==-1)
						r=i+1;
					else
						r=0;
				}
			}
			System.out.println(r==0?-1:r);
		}
	}
}