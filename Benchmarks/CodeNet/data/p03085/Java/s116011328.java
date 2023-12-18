import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		String b = sc.next();
      	Map<String, String> map = new HashMap<>();
      	map.put("A", "T");
      	map.put("T", "A");
      	map.put("C", "G");
      	map.put("G", "C");
      	System.out.println(map.get(b));
    }
}