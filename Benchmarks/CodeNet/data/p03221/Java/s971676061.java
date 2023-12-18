import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int M = Integer.parseInt(scanner.next());
	    int[] P = new int[M];
	    long[] Y = new long[M];
	    Map<Integer, List<Long>> map = new HashMap<Integer, List<Long>>();
	    
	    for (int i = 0; i < M; i++) {
	    	P[i] = Integer.parseInt(scanner.next());
	    	Y[i] = Long.parseLong(scanner.next());
	    	if (map.containsKey(P[i])) {
	    		map.get(P[i]).add(Y[i]);
	    	} else {
	    		List<Long> l = new ArrayList<Long>();
	    		l.add(Y[i]);
	    		map.put(P[i], l);
	    	}
	    }
	    
	    for(Map.Entry<Integer, List<Long>> entry : map.entrySet()){
	    	Collections.sort(entry.getValue());
	    }
	    
	    for (int i = 0; i < M; i++) {
	    	int ind = map.get(P[i]).indexOf(Y[i]) + 1;
	    	System.out.println(String.format("%06d", P[i]) + String.format("%06d", ind));
	    }
	}

}