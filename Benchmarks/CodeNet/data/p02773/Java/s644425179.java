import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			String s = in.nextLine();
			if (map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}	
		}
		ArrayList<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
	            public int compare(Entry<String, Integer> o1,
	                    Entry<String, Integer> o2) {
	            	if(o2.getValue().equals(o1.getValue())){
	            		return o1.getKey().compareTo(o2.getKey());
	            	}else return o2.getValue().compareTo(o1.getValue());
	            }
	            
	    });
		int max = list.get(0).getValue();
		//System.out.println("\nmax:" + max);
		for(Map.Entry<String,Integer> mapping:list) {
			//System.out.println(mapping.getKey()+":"+mapping.getValue()); 
			if(mapping.getValue()==max) System.out.println(mapping.getKey());
		}
		
	}
}
