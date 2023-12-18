import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	Set<Character> s = new HashSet<>();
    	for (char c : S.toCharArray()) {
    		s.add(c);
    	}
    	char a = 'a';
    	while (a <= 'z') {
    		if (!s.contains(a)) {
    			System.out.println(a);
    			System.exit(0);
    		}
    		a++;
    	}
    	System.out.println("None");
    }
}