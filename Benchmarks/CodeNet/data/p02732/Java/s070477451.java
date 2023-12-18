import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();
		int s;
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
		    a[i] = sc.nextInt();
		    if(map.containsKey(a[i])) {
		        map.put(a[i], map.get(a[i])+1);
		    }else {
		        map.put(a[i], 1);
		    }
		}
		
		Map<Integer, Integer> ansmap = new HashMap<>();
		for(int key : map.keySet()) {
	        map.put(key, map.get(key)-1);
	        int sum = 0;
	        for(int keyj : map.keySet()) {
	            sum += combi(map.get(keyj));
	        }
	        ansmap.put(key, sum);
	        map.put(key, map.get(key)+1);
	    }
	    
	    for(int k = 0; k < N; k++) {
	        System.out.println(ansmap.get(a[k]));
	    }
		
	}
	
	static int combi(int a) {
	    if(a == 1) {
	        return 0;
	    }else {
	        return a * (a - 1) / 2;
	    }
	}
}
