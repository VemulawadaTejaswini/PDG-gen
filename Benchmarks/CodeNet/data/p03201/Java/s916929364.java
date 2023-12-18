import java.util.*;
import java.util.Map.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		TreeMap<Integer,Integer> m=new TreeMap<>();
		for(int i=0;i<n;++i)
			m.merge(Integer.parseInt(s.next()),1,Integer::sum);
		
		int r=0;
		while(!m.isEmpty()){
			Entry<Integer,Integer> e=m.pollLastEntry();
			int q=e.getKey()^Integer.highestOneBit(e.getKey());
			Integer f=m.get(q);
			if(f!=null) {
				int v=Math.min(f,e.getValue());
				r+=v;
				m.merge(q,-v,Integer::sum);
			}
		}
		System.out.println(r);
	}
}
