import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String c = sc.next();
        String[] target = {"a","e","i","o","u"};
        
        for (String s : target) {
        	if (s.equals(c)) {
        		System.out.println("vowel");
        		return;
        	}
        }
        
        System.out.println("consonant");
    }
}