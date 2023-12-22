import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt(),p[]=new int[n];
		for(int l=n*(n-1)/2;l>0;--l) {
			int a=getInt()-1,b=getInt()-1,pa=getInt(),pb=getInt();
			if(pa>pb)
				p[a]+=3;
			else if(pa<pb)
				p[b]+=3;
			else {
				++p[a];
				++p[b];
			}
		}
		AtomicInteger c=new AtomicInteger(0);
		int r[]=new int[n];
		REPS(1,n).boxed()
				.collect(Collectors.groupingBy(i->p[i-1]))
				.entrySet().stream()
				.sorted(Entry.comparingByKey(Comparator.reverseOrder()))
				.map(Entry::getValue)
				.forEach(o->{
					c.incrementAndGet();
					for(int i:o)
						r[i-1]=c.get();
					c.addAndGet(o.size()-1);
				});
		Arrays.stream(r).forEach(System.out::println);
	}
}