import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int end = str.length();
		HashSet<Character> set = new HashSet<>();
		ArrayDeque<Suffix> deq = new ArrayDeque<>();
		for (int i = str.length() - 1; i >= 0; i--) {
		    set.add(str.charAt(i));
		    if (set.size() == 26) {
		        deq.push(new Suffix(str.substring(i, end)));
		        end = i;
		        set.clear();
		    }
		}
		Suffix suf = new Suffix(str.substring(0, end));
		StringBuilder sb = new StringBuilder();
		char c = suf.getFirst(0);
		sb.append(c);
		while (deq.size() > 0) {
		    Suffix tmp = deq.pop();
		    c = tmp.getFirst(c);
		    sb.append(c);
		}
		System.out.println(sb);
	}
	
	static class Suffix {
	    String value;
	    
	    public Suffix (String value) {
	        this.value = value;
	    }
	    
	    public char getFirst(char c) {
	        return getFirst(value.indexOf(c) + 1);
	    }
	    
	    public char getFirst(int idx) {
	        HashSet<Character> set = new HashSet<>();
	        for (int i = idx; i < value.length(); i++) {
	            set.add(value.charAt(i));
	        }
	        for (char c = 'a'; c <= 'z'; c = (char)(c + 1)) {
	            if (!set.contains(c)) {
	                return c;
	            }
	        }
	        return 'X';
	    }
	    
	}
}
