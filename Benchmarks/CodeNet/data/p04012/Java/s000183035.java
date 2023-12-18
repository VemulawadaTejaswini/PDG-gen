import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	Map<Character, Integer> map = new HashMap<>();
    	for (Character c : S.toCharArray()) {
    		if (map.containsKey(c)) {
    			map.put(c, map.get(c)+1);
    		} else {
    			map.put(c, 1);
    		}
    	}
    	String ans = "Yes";
    	for (Integer count : map.values()) {
    		if (count%2 != 0) {
    			ans = "No";
    		}
    	}
    	System.out.println(ans);
    }
}