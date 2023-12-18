    /* package whatever; // don't place package name! */
     
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class Main
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		Scanner sc = new Scanner(System.in);
    		while(sc.hasNext()) {
    			int n = sc.nextInt();
	    		long k = sc.nextLong();
	    		
	    		ArrayList<Long> keys = new ArrayList<Long>();
	    		HashMap<Long, Long> map = new HashMap<Long, Long>();
	    		
	    		for(int i = 0; i < n; i++) {
	    			long a = sc.nextLong();
	    			long b = sc.nextLong();
	    			if(map.containsKey(i)) {
	    				map.put(a, map.get(a) + b);
	    			} else {
	    				map.put(a, b);
	    				keys.add(a);
	    			}
	    		}
	    		Collections.sort(keys);
	    		for(long key : keys) {
	    			k = k - map.get(key);
	    			if(k <= 0) {
	    				System.out.println(key);
	    				break;
	    			}
	    		}		
    		}
    		
    	}
    }