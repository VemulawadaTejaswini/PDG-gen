import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int K = sc.nextInt();
        
        
        Set<String> set = new TreeSet<>();
        
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