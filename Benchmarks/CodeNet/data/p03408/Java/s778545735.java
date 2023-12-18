import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  /**
   * Main method.
   */
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    Map<String, Integer> map = new HashMap<>();
    
    final int N = s.nextInt();   
    for (int i = 0; i < N; i++) {
    	String str = s.next();
    	if (map.containsKey(str)) {
    		map.put(str, map.get(str)+1);
    	} else {
    		map.put(str, 1);
    	}
    }
    
    final int M = s.nextInt();
    for (int i = 0; i < M; i++) {
    	String str = s.next();
    	if (map.containsKey(str)) {
    		map.put(str, map.get(str)-1);
    	} else {
    		map.put(str, -1);
    	}
    }
    
    int max = -9999;
    for (String str : map.keySet()) {
    	max = Math.max(max, map.get(str));
    }
     
    System.out.println(max < 0 ? "0" : max);
 
  }
}
