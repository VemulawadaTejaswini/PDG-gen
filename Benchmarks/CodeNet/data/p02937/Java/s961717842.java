import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final String s = sc.next();
    		final String t = sc.next();
    		Set<Character> sSet = new HashSet<>();
    		Set<Character> tSet = new HashSet<>();
    		for (int i=0; i<s.length(); i++) {
    			sSet.add(s.charAt(i));
    		}
    		for (int i=0; i<t.length(); i++) {
    			tSet.add(t.charAt(i));
    		}
    		if (!sSet.containsAll(tSet)) {
    			System.out.println("-1");
    			System.exit(0);
    		}

    		// boolean[] flags = new boolean[t.length()];
    		long counter = 0;
    		int sIndex = 0;
    		for (int i=0; i<t.length(); i++) {
    			while (s.charAt(sIndex) != t.charAt(i)) {
    				sIndex++;
    				counter++;
    				if (sIndex >= s.length()) {
    					sIndex %= s.length();
    				}
    			}
    		}
    		counter++;
    		System.out.println(counter);

    	} finally {
    		sc.close();
    	}
    }
}

