import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
 
 
public class Main {
     
	public static String[] kan_alphabets = {
	    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
	    "ld", "mb", "mp", "nc", "nd", "ng", "nt", "nw", "ps", "qu", "cw", "ts"
	};
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int n = sc.nextInt();
        
        Map<String, LinkedHashMap<String, Integer>> map = new HashMap<String, LinkedHashMap<String, Integer>>();
        for(String alphabet : kan_alphabets){
        	map.put(alphabet, new LinkedHashMap<String, Integer>());
        }
        
        while(sc.hasNext()){
        	String input = sc.next();
        	
        	String prev = null;
        	while(input.length() != 0){
        		String matched = null;
        		for(String alphabet : kan_alphabets){
        			if(input.startsWith(alphabet)){
        				matched = alphabet;
        			}
        		}
        		
        		if(matched == null){
        			break;
        		}
        		input = input.substring(matched.length());
        		
        		if(prev != null){
        			if(!map.get(prev).containsKey(matched)){
        				map.get(prev).put(matched, 0);
        			}
        			map.get(prev).put(matched, map.get(prev).get(matched) + 1);
        		}
        		prev = matched;
        	}
        }
        
        for(String alphabet : kan_alphabets){
        	if(map.get(alphabet).isEmpty()){
        		System.out.println(alphabet + " " + "a" + " " + 0);
        	}else{
        		String occur = null;
        		int max = 0;
        		for(Entry<String, Integer> entry : map.get(alphabet).entrySet()){
        			if(entry.getValue() >= max){
        				occur = entry.getKey();
        				max = entry.getValue();
        			}
        		}
        		
        		System.out.println(alphabet + " " + occur + " " + max);
        	}
        }
        
    }
 
}