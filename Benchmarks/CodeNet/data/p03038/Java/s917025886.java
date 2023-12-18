import java.util.*;
import java.util.Map.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();

		TreeMap<Integer,Long>map=new TreeMap<>(Comparator.reverseOrder());
		for(int i=0;i<n;++i)
			map.merge(s.nextInt(),1L,Long::sum);
		for(int i=0;i<m;++i) {
			long a=s.nextInt();
			int b=s.nextInt();
			map.merge(b,a,Long::sum);
		}


		int c=0;
		long r=0;
		for(Entry<Integer,Long>e:map.entrySet()) {
			long d=Math.min(n-c,e.getValue());
			r+=d*e.getKey();
			c+=d;
			if(c==n)
				break;
		}
		//System.err.println(map);
		System.out.println(r);
	}
}