import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> hm = new HashMap<>();
		int max = 1;
		for(int i=0;i<n;i++) {
		    String s = sc.next();
		    if(!hm.containsKey(s))
		    	hm.put(s,1);
		    else {
		    	hm.put(s, hm.get(s)+1);
		    	max = Math.max(max, map.get(s)+1);
			}
		}      	
      	List<String> ans = new ArrayList<>();
		for(String i: hm.keySet())
			if(map.hey(key) == max)
				ans.add(key);
		Collections.sort(ans);
		for(Sring item: ans)
			System.out.println(item);
	}
}