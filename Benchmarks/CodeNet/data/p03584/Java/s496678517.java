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
		{
			m.put(lim,0L);
			long v=1;
			while(v<=lim)
				v*=2;
			v-=1;
			long V=1;
			while(V<=lim) {
				if((V&lim)>0)
					m.put(v&~V,0L);
				V*=2;
			}
		}

		for(int i=0;i<n;++i) {
			long v=getLong();
			int c=getInt();
			for(Entry<Long,Long> e:m.entrySet()){
				if((v&~e.getKey())==0)
					m.put(e.getKey(),e.getValue()+c);
			}
		}
		//System.out.println(m);
		System.out.println(m.values().stream().mapToLong(o->o).max().getAsLong());
	}
}