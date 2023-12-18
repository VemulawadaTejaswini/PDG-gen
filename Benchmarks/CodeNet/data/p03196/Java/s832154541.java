



import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	public static final long MOD = 1_000_000_007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		
		TreeMap<Long, Integer> map = new TreeMap<>();
		
		
		for (long i=2;i*i<=p;i++) {
			int counter = 0;
				while(p%i==0) {
					p/=i;
					counter++;
				}
			
			if(counter>0) {
				map.put(i, counter);
			}
		}
		if (p>1) {
			map.put(p, 1);
		}
		
		
		long ans = 1;
		for (Map.Entry<Long, Integer> e : map.entrySet()) {
			for (int i=0;i<e.getValue()/n;i++) {
				ans*=e.getKey();
			}
		}
		System.out.println(ans);
	}
	
	

}
