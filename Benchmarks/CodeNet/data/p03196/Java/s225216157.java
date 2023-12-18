import java.math.BigInteger;
import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long n = sc.nextLong();
			long p = sc.nextLong();
			
			HashMap<Long, Long>res = primeDecomposition(p);
			long ans = 1;
//			debug(res.keySet());
			for(Long key: res.keySet()){
				long value = res.get(key);
//				debug(key, value);
				if(value / n > 0){
					for(int i = 0; i < (value / n); i++){
						ans *= key;
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	private HashMap<Long, Long> primeDecomposition(long n) {
		HashMap<Long, Long> map = new HashMap<>();
		for(long i=2; i * i <= n; i++){
			while(n % i == 0){
				if(map.containsKey(i)){
					map.put(i, map.get(i) + 1);
				}
				else{
					map.put(i, 1L);
				}
				n /= i;
			}
		}
		if(n != 1){
			if(map.containsKey(n)){
				map.put(n, map.get(n) + 1);
			}
			else{
				map.put(n, 1L);
			}
		}
		return map;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
