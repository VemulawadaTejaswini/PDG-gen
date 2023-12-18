import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();
		int s;
		int[] a = new int[N];
		
		long max = 0;
		for(int i = 0; i < N; i++) {
		    a[i] = sc.nextInt();
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }else {
                map.put(a[i], 1);
            }
		}
		
		for(int key : map.keySet()) {
		    max += combi(map.get(key));
		}
		
		for(int i = 0; i < N; i++) {
		    System.out.println(max - combi(map.get(a[i])) + combi(map.get(a[i])-1));
		}
		
	}
	
	static int combi(int a) {
	    if(a == 1 || a == 0) {
	        return 0;
	    }else {
	        return a * (a - 1) / 2;
	    }
	}
}