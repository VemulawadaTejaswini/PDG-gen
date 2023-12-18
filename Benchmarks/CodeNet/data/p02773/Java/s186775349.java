import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
       InputReader in = new InputReader(System.in);
       int n = in.readInt(); 
       HashMap<String ,Integer> map = new HashMap<>(); 
       
       for(int i =0; i<n; i++) {
    	   String s = in.readString();
    	   if(map.containsKey(s)) {
    		    map.put(s, map.get(s) + 1);
    	   }
    	   else  map.put(s, 1);
       }
        
       HashSet<String> votes = new HashSet<>(); 
       
       int max = Integer.MIN_VALUE; 
       for(Map.Entry<String, Integer> entry: map.entrySet()) {
    	   if(max <= entry.getValue()) {
    		   max = entry.getValue();
    	   }
       }
       for(Map.Entry<String , Integer> entry: map.entrySet()) {
    	   if(entry.getValue() == max) {
    		   votes.add(entry.getKey()); 
    	   }
       }
    	 ArrayList<String> list = new ArrayList<>(votes); 
       Collections.sort(list);
       for(String i : list) {
    	   System.out.println(i); 
       }
	}
}