import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < n; i++){
			String in = sc.next();
			int count = sc.nextInt();
			if(map.get(in) == null){
				map.put(in, count);
			}else{
				map.put(in, map.get(in) + count);
			}
		}
		
		TreeSet<String> set = new TreeSet<String>(map.keySet());
		
		for(String str : set){
			System.out.println(str + " " + map.get(str));
		}
		
	}

}