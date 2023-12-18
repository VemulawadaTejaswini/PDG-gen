import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt(),m=getInt();
		ArrayList<ArrayList<Integer>>a=new ArrayList<>();

		for(int i=0;i<n;++i) {
			ArrayList<Integer>d=new ArrayList<>();
			a.add(d);
			INS(m).forEach(d::add);
		}

		HashMap<Integer,Integer>count=new HashMap<>();
		int r=n;
		for(int i=0;i<m-1;++i){
			count.clear();
			for(int j=0;j<n;++j) {
				count.merge(a.get(j).get(0),1,Integer::sum);
			}
			r=Math.min(r,count.values().stream().max(Comparator.naturalOrder()).get());
			int hoge=count.entrySet().stream().max(Entry.comparingByValue()).get().getKey();
			a.stream().forEach(o->o.removeIf(oo->oo==hoge));
		}
		System.out.println(r);
	}
}
