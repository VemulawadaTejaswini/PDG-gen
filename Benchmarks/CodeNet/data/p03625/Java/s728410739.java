import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		
		for(int i = 0; i < N; i++){
			long a = in.nextInt();
			Long count = map.get(a);
			if(count == null) map.put(a, Long.valueOf(1));
			else map.put(a, count+1);
		}
		
		List<Entry<Long, Long>> listEntries = new ArrayList<Entry<Long, Long>>(map.entrySet());
        
        Collections.sort(listEntries, new Comparator<Entry<Long, Long>>() {
            public int compare(Entry<Long, Long> obj1, Entry<Long, Long> obj2) {
                return obj2.getKey().compareTo(obj1.getKey());
            }
        });
        
        /*
        for(int i = 0; i < listEntries.size(); i++){
        	Entry e = listEntries.get(i);
        	System.out.println(e.getKey() + " " + e.getValue());
        }
        */
        
        long max1 = 0, max2 = 0;
        
        for(int i = 0; i < listEntries.size(); i++) {
        	Entry e = listEntries.get(i);
        	long k = (long)e.getKey();
        	long v = (long)e.getValue();
        	
        	if(v == 4){
        		if(k > max1) max1 = k;
        		max2 = k;
        		break;
        	}else if(v >= 2){
        		if(max1 == 0) max1 = k;
        		else{
        			max2 = k;
        			break;
        		}
        	}
        }
        
        System.out.println(max1 * max2);
	}
}
