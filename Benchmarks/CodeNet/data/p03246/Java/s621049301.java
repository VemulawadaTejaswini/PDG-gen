import java.util.*;
import java.util.Map.*;

public class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		HashMap<Integer,Integer> o=new HashMap<>(),e=new HashMap<>();

		int n=s.nextInt();

		for(int i=0;i<n;++i)
			(i%2==0?e:o).merge(s.nextInt(),1,Integer::sum);

		Entry<Integer,Integer> O=o.entrySet().stream().max(Entry.<Integer,Integer>comparingByValue()).get();
		Entry<Integer,Integer> E=e.entrySet().stream().max(Entry.<Integer,Integer>comparingByValue()).get();
		o.remove(O.getKey());
		e.remove(E.getKey());
		Entry<Integer,Integer> O2=o.entrySet().stream().max(Entry.<Integer,Integer>comparingByValue()).orElse(null);
		Entry<Integer,Integer> E2=e.entrySet().stream().max(Entry.<Integer,Integer>comparingByValue()).orElse(null);

		int r=O.getValue()+E.getValue();
		if(O.getKey()==E.getKey()){
			r=Math.max(O.getValue()+(E2==null?0:E2.getValue()),E.getValue()+(O2==null?0:O2.getValue()));
		}

		System.out.println(n-r);
	}
}
