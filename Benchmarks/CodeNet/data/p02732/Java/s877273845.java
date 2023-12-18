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
        
		int sum;
		for(int k = 0; k < N; k++) {
		    sum = 0;
		    map.put(a[k], map.get(a[k])-1);
		    for(int key : map.keySet()) {
		        sum += combi(map.get(key));
		    }
		    map.put(a[k], map.get(a[k])+1);
		    System.out.println(sum);
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
