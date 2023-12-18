import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("A", "T");
        hashmap.put("T", "A");
        hashmap.put("C", "G");
        hashmap.put("G", "C");
		String a = sc.next();
 
		System.out.println(hashmap.get(a));
    }
}
