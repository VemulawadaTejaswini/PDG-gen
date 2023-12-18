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
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++){
			int a = in.nextInt();
			Integer count = map.get(a);
			if(count == null) map.put(a, 1);
			else map.put(a, count+1);
		}
		
		List<Entry<Integer, Integer>> listEntries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        
        Collections.sort(listEntries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getKey().compareTo(obj1.getKey());
            }
        });
        
        /*
        for(int i = 0; i < listEntries.size(); i++){
        	Entry e = listEntries.get(i);
        	System.out.println(e.getKey() + " " + e.getValue());
        }
        */
        
        int max1 = 0, max2 = 0;
        
        for(int i = 0; i < listEntries.size(); i++) {
        	Entry e = listEntries.get(i);
        	int k = (int)e.getKey();
        	int v = (int)e.getValue();
        	
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
