import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int K = sc.nextInt();
        
        Set<String> set = new TreeSet<>((s1,s2) -> {
        	boolean s1con = s1.contains(s2);
        	boolean s2con = s2.contains(s1);
        	boolean fasteq = s1.charAt(0) == s2.charAt(0);
        	if (fasteq && s1.length() != s2.length() && (s1con || s2con)) {
        		if (s1con) {
        			return 1;
        		} 
        		return -1;
        	} else if (fasteq && s1.length() == s2.length()) {
        		return s2.compareTo(s1);
        	}
        	
        	return s1.compareTo(s2);
        });
        
        for (int i = 0; i < s.length(); i++) {
        	for (int j = i; j < s.length(); j++) {//1 <= K <= 5の為
        		String sub = s.substring(i, j + 1);
        		set.add(sub);
        	}
        }
        
    	int index = 0;
    	for (String ans : set) {
    		if (index == (K - 1)) {
    			System.out.println(ans);
    			return;
    		}
    		index++;
    	}
    	
    	
    }
    
}