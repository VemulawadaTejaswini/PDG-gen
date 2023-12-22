import java.util.*;
import java.util.Map.*;

class Main{
	public static void main(String[] A){
		Scanner s=new Scanner(System.in);
		TreeMap<Integer,Integer>m=new TreeMap<>();
		while(true) {
			int n=s.nextInt(),v=s.nextInt();
			if(n+v==0)
				return;
			m.clear();
			
			for(int i=0;i<n;++i)
				m.merge(s.nextInt(),1,Integer::sum);
			
			int r=-1;
			for(Entry<Integer,Integer> i:m.entrySet()) {
				Integer k=i.getKey();
				Integer a;
				if(k*2==v&&i.getValue()!=2) {
					a=m.lowerKey(v-k);
				}else {
					a=m.floorKey(v-k);
					if(a!=null)
						r=Math.max(r,a+k);
				}
			}
			System.out.println(r==-1?"NONE":r);
		}
	}
}

