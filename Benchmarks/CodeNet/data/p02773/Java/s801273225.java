import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<String,Integer> tV = new TreeMap<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int nV = scn.nextInt();
		for(int i = 0;i<nV;i++) {
			String v = scn.next();
			
			if(!tV.isEmpty()) {
				if(tV.containsKey(v)) {
					tV.put(v,tV.get(v)+1);
				}else {
					tV.put(v,1);
				}
			}else {
				tV.put(v,1);
			}
			
		}
		for(Map.Entry<String,Integer> vote : tV.entrySet()) {
			list.add(vote.getValue());
		}
		if(Collections.max(list) == Collections.min(list)) {
			for(Map.Entry<String,Integer> vote : tV.entrySet()) {
				System.out.println(vote.getKey().toString());
			}
		}else {
			if(Collections.min(list) != Collections.max(list)) {
				for(Map.Entry<String,Integer> vote : tV.entrySet()) {
					if(vote.getValue() != Collections.min(list)) {
						System.out.println(vote.getKey().toString());
					}
				}
			}
		}	
	}
}