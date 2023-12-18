import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt();

		Map<Long,Integer>a=new TreeMap<>(Comparator.reverseOrder());

		INS(n).asLongStream().forEach(i->a.merge(i,1,Integer::sum));

		long r=-1;
		for(Entry<Long,Integer> e:a.entrySet()) {
			long k=e.getKey();
			int v=e.getValue();
			if(r==-1&&v>=4) {
				System.out.println(k*k);
				return;
			}
			if(r==-1&&v>=2) {
				r=k;
				continue;
			}
			if(r!=-1&&v>=2) {
				System.out.println(r*k);
				return;
			}
		}
		System.out.println(0);
	}
}