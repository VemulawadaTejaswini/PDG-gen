import java.util.*;
import java.util.LinkedHashMap; 
import java.util.Map; 
import java.util.Set;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		String s;
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
		    str[i] = new String();
		    s = sc.next();
		    str[i] = s;
		}
		for(String i: str) {
		    Integer j = hm.get(i);
		    hm.put(i, (j==null)?1:j+1);
		}
		int x=(Collections.max(hm.values()));  // max value in hashmap
        for (Map.Entry<String, Integer> ent : hm.entrySet()) {  // Itrate through hashmap
            if (ent.getValue()==x) {
                System.out.println(ent.getKey());     // Print the key with max value
            }
        }
	}
}