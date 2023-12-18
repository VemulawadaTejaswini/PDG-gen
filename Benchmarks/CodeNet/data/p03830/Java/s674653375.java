import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	static Map<Long,Long> map= new TreeMap<>();
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long n=sc.nextLong();
	  for(long i=1;i<=n;i++)primeEnum(i);
	  long res=1;
	  for (long key : map.keySet()){
	    	res*=(map.get(key)+1);
	    	res%=1000000007;
	    	//System.out.println(key+" "+map.get(key));
	    }
	  System.out.println(res);

  }
	public static Map<Long,Long> primeEnum(long n) {
		for(long i=2;i<=Math.sqrt(n);i++) {
			if(n%i!=0)continue;
			long e=0;
			while(n%i==0) {
				e++;
				n/=i;
			}
			if(map.containsKey(i)) {
				map.put(i, e+map.get(i));
			}else {
				map.put(i, e);
			}
		}
		if(n!=1) {
			if(map.containsKey(n)) {
				map.put(n, 1+map.get(n));
			}else {
				map.put(n, 1L);
			}
		}
		return map;
	}
}

