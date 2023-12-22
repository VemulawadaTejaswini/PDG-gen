import java.util.*;
import java.util.Map.Entry;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				if(map.containsKey(tmp)) {
					map.put(tmp, map.get(tmp)+1);
					System.gc();
				}
				else {
					map.put(tmp, 1);
				}
			}
			boolean ok = false;
			for(Entry<Integer,Integer> entry : map.entrySet()) {
				if(entry.getValue() > n/2) {
					System.out.println(entry.getKey());
					ok = true;
					break;
				}
			}
			if(!ok) {
				System.out.println("NO COLOR");
			}
		}
	}
 }