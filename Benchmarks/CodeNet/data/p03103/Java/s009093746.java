import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m= sc.nextLong();
		long l=0;
		long price=0;
		Map<Long,Long> map = new HashMap<>();
		for(int i=0;i<n;i++) {
				long key= sc.nextLong();
				long value = sc.nextLong();
				if(map.containsKey(key)) {
			map.put(key,value+map.get(key));
				}else {
					map.put(key,value);
				}
		}
		Long[] mapkey = (Long[]) map.keySet().toArray();
		Arrays.sort(mapkey);
	
		for( long nkey: mapkey) {
			long k=map.get(nkey);
			m-=k;
			if(m>0) {
			l+=k*nkey;
			}else{
				l+=nkey*(m+k);
				System.out.println(l);
				break;
			}


		}
    }

}
