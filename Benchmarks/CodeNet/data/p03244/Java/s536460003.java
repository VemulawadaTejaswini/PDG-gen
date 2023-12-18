import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n/2];
		int[] b = new int[n/2];
		for(int i=0; i<n/2; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> aMap = new HashMap<>();
		Map<Integer, Integer> bMap = new HashMap<>();
		for (int i=0; i<n/2; i++) {
			aMap.putIfAbsent(a[i], 0);
			aMap.compute(a[i], (k,v) -> ++v);
			bMap.putIfAbsent(b[i], 0);
			bMap.compute(b[i], (k,v) -> ++v);
		}
		int aFirstKey = 0;
		int aFirstValue = 0;
		int aSecondValue = 0;
		int bFirstKey = 0;
		int bFirstValue = 0;
		int bSecondValue = 0;

		for(Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if (value > aFirstValue) {
				aSecondValue = aFirstValue;
				aFirstKey = key;
				aFirstValue = value;
			} else if (value > aSecondValue) {
				aSecondValue = value;
			}
		}
		for(Map.Entry<Integer, Integer> entry : bMap.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if (value > bFirstValue) {
				bSecondValue = bFirstValue;
				bFirstKey = key;
				bFirstValue = value;
			} else if (value > bSecondValue) {
				bSecondValue = value;
			}
		}
		
		System.out.println("aFirstKey: "+aFirstKey);
		System.out.println("aFirstValue: "+aFirstValue);
		System.out.println("aSecondValue: "+aSecondValue);
		System.out.println("bFirstKey: "+bFirstKey);
		System.out.println("bFirstValue: "+bFirstValue);
		System.out.println("bSecondValue: "+bSecondValue);
		
		
		if (aFirstKey == bFirstKey) {
			System.out.println(n - Math.max(aFirstValue+bSecondValue, aSecondValue+bFirstValue));
		} else {
			System.out.println(n - (aFirstValue + bFirstValue));
		}
	}
}
