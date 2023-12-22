import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
    
public class Main {
    public static void main(String[] args) {
        (new Main()).execute();
    }
    private void execute() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Integer[] arr = new Integer[m];
        for(int i = 0 ; i < m ; i++) {arr[i] = Integer.valueOf(m-i);}
        ObsessionComparator comp = new ObsessionComparator(m);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {comp.add(sc.nextInt(), sc.nextInt());}        
        Arrays.sort(arr, comp);        
        for(Integer i : arr){System.out.println(i);}
        sc.close();
    }
    
    private class ObsessionComparator implements Comparator<Integer> {
    	private Map<Integer, Set<Integer>> sortMap = new HashMap<Integer, Set<Integer>>();
    	private ObsessionComparator(int count) {
    		for(int i = 1 ; i <= count ; i++) {
    			sortMap.put(Integer.valueOf(i), new HashSet<Integer>());
    		}
    	}

    	private void add(Integer x, Integer y) {
    		sortMap.get(x).add(y);
    	}
    	private boolean isSorted(Integer x, Integer y) {
    		if(sortMap.get(x).contains(y)) {
    			return true;
    		} else if(sortMap.get(x).isEmpty()) {
    			return false;
    		} else {
    			for(Integer next : sortMap.get(x)) {
    				if(isSorted(next, y)){
    					sortMap.get(x).add(y);
    					return true;
    				}
    			}
    			return false;
    		}
    	}
    	
    	@Override
		public int compare(Integer arg0, Integer arg1) {
    		if(isSorted(arg0, arg1)) {
    			return -1;
    		} else if(isSorted(arg1, arg0)) {
    			return 1;
    		} else {
    			return 0;    			
    		}
		}
    }
}