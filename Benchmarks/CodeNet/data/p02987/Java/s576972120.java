import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
    	if (map.containsKey(c)) {
        	map.put(c, map.get(c) + 1);
        } else {
          map.put(c, 1);
        }
    }
    
    for (char i : map.keySet()) {
    	if (map.get(i) != 2) {
        	System.out.println("No");
          	return;
        }
    }
    System.out.println("Yes");
  }
}