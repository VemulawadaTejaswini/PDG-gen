
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n  =sc.nextInt();
		long a[] = new long[n];
		
		for(int i =0 ;i < n ; i++){
			a[i] = sc.nextInt();
		}
		
		long ans = Long.MAX_VALUE;
		for(int i = 0;  i< n ; i++){
			long sum = i;
			sum += count(i,0,a)*2;
			sum += countRev(i,0,a)*2;
//			System.out.println( i);
//			System.out.println( count(i,0,a)*2);
//			System.out.println( countRev(i,0,a)*2);
			ans = Math.min(sum, ans);
		}
		System.out.println(ans);
	}
	
	Map<String,Long> map = new HashMap<String,Long>();
	Map<String,Long> mapRev = new HashMap<String,Long>();
	
	long count(int i, long b, long[] a){
		if(i >= a.length ){
			return 0;
		}

		String key = i+"_"+b;
		if(map.containsKey(key)){
			return map.get(key);
		}
		
		long res = 0;
		long x = 0;
		long now = a[i] << (b*2L);
		
		if(i+1 < a.length){
			x = Math.max(0,(Long.numberOfLeadingZeros(a[i+1]) - Long.numberOfLeadingZeros(now))/2 - 1);			
			for(;now > (a[i+1] << (x*2L));x++){}
			res = count(i+1,x, a) + x;
		}
		
		map.put(key, res);
		return res;
	}

	long countRev(int i, long b, long[] a){
		if(i < 0){
			return 0;
		}

		String key = i+"_"+b;
		if(mapRev.containsKey(key)){
			return mapRev.get(key);
		}
		
		long res = 0;
		
		long x = 0;
		long now = a[i] << (b*2);
		
		if(i - 1 >= 0){
			x = Math.max(0,(Long.numberOfLeadingZeros(a[i-1]) - Long.numberOfLeadingZeros(now))/2 - 1);			
			for(;now > (a[i-1] << (x*2L));x++){}
			res = countRev(i-1,x, a) + x;
		}
		
		mapRev.put(key, res);
		return res;
	}

	
	
}
