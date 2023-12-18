import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m= sc.nextLong();
		long count=0;
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
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
		for( long nkey: map.keySet()) {
			long tempCount=map.get(nkey);
			m-=tempCount;
			if(m>0) {
				count+=tempCount*nkey;
			}else{
				count+=nkey+(m+tempCount);
				System.out.println(count);
				break;
			}


		}
    }

}
