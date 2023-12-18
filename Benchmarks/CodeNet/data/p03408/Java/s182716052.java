import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	for(int i = 0; i<N; i++) {
	    String str = sc.next();
	    Integer base = (map.get(str)==null)?0: map.get(str);
	    map.put(str, base+1);
	}
	int M = sc.nextInt();
	for(int i = 0; i<M; i++) {
            String str = sc.next();
	    Integer base = (map.get(str)==null)?0: map.get(str);
            map.put(str, base-1);
	}
	int max = 0;
	for(String str: map.keySet()) {
	    max = Math.max(max,map.get(str));
	}
	System.out.println(max);
    }

}