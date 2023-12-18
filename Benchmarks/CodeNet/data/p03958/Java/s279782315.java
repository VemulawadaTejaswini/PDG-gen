import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static IntStream REPS(int l,int r) {
		return IntStream.rangeClosed(l,r);
	}
	static IntStream INS(int n) {
		return REPS(n).map(i->getInt());
	}
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[]__){
		int k=getInt(),t=getInt();
		HashMap<Integer,Integer> m=new HashMap<>();
		REPS(t).forEach(i->m.put(i,getInt()));
		
		int l=-1,c=0;
		for(int i=0;i<k;i++) {
			final int last=l;
			Optional<Integer> hoge=m.entrySet().stream()
					.filter(o->o.getKey()!=last&&o.getValue()!=0)
					.max(Entry.comparingByValue())
					.map(Entry::getKey);
			
			if(!hoge.isPresent())
				c++;
			m.merge((l=hoge.orElse(last)),-1,Integer::sum);
		}
		System.out.println(c);
	}
}
