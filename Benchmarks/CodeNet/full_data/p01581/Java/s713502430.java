import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Main{

    int size;
    HashMap<Integer,Integer> lru;
    
    public LRU(int capacity) {
        lru=new LinkedHashMap<Integer,Integer>();
        size=capacity;
    }
    
    public int get(int key) {
        if(lru.containsKey(key))
            return lru.get(key);
        else
            return -1;
    }
    
    public void set(int key, int value) {
    	if(lru.containsKey(key))
    		lru.remove(key);
    	lru.put(key,value);
    	
    	if(lru.size() > size){ 		
    		Entry<Integer, Integer> entry=lru.entrySet().iterator().next();
    		lru.remove(entry.getKey(), entry.getValue());
    	}    		
    }

}