import java.util.*;
import java.util.Map.*;

class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		HashMap<Integer,Integer> o=new HashMap<>(),e=new HashMap<>();
		o.put(0,0);
		e.put(0,0);
		int n=s.nextInt();

		for(int i=0;i<n;++i)
			(i%2==0?e:o).merge(s.nextInt(),1,Integer::sum);

		Comparator<Entry<Integer,Integer>> c=Entry.comparingByValue();
		Entry<Integer,Integer> O=o.entrySet().stream().max(c).get();
		Entry<Integer,Integer> E=e.entrySet().stream().max(c).get();
		o.remove(O.getKey());
		e.remove(E.getKey());
		Entry<Integer,Integer> O2=o.entrySet().stream().max(c).get();
		Entry<Integer,Integer> E2=e.entrySet().stream().max(c).get();

		n-=O.getKey().equals(E.getKey())
				?O.getValue()+E.getValue()
				:Math.max(
					O.getValue()+E2.getValue(),
					E.getValue()+O2.getValue());
		System.out.println(n);
	}
}
