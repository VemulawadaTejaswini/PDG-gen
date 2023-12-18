import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	static long getLong(){return Long.parseLong(s.next());}

	public static void main(String[]$){
		int n=getInt();
		long lim=getLong();

		HashMap<Long,Long>m=new HashMap<>(),buf=new HashMap<>();
		m.put(0L,0L);

		for(int i=0;i<n;++i) {
			buf.clear();
			{
				long v=getLong();
				int c=getInt();
				for(Entry<Long,Long>e:m.entrySet()){
					long or=e.getKey()|v;
					if(or<=lim) {
						buf.merge(or,e.getValue()+c,Math::max);
					}
				}
			}
			buf.forEach((v,c)->m.merge(v,c,Math::max));
		}
		System.out.println(m.values().stream().mapToLong(o->o).max().getAsLong());
	}
}