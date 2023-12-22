import java.util.*;

class Main {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	loop: while (true) {
	    String s1 = sc.next();
	    if (s1.equals(".")) return;
	    String s2 = sc.next();
	    
	    if (s1.equals(s2)) {
		System.out.println("IDENTICAL");
		continue;
	    }

	    int s1count = 0, s2count = 0;
	    for (int i = 0; i < s1.length(); i++) {
		if (s1.charAt(i) == '"')
		    s1count++;
	    }
	    for (int i = 0; i < s2.length(); i++) {
		if (s2.charAt(i) == '"')
		    s2count++;
	    }
	    if (s1count != s2count) {
		System.out.println("DIFFERENT");
		continue;
	    }

	    int count = 0;
	    for (int i = 0, j = 0; i<s1.length()&&j<s2.length(); i++, j++) {
		if (s1.charAt(i) == '"' && s2.charAt(j) == '"') {
		    i++;
		    j++;
		    String t1 = "", t2 = "";
		    while (s1.charAt(i) != '"') {
			t1 += s1.charAt(i);
			i++;
		    }
		    while (s2.charAt(j) != '"') {
			t2 += s2.charAt(j);
			j++;
		    }
		    if (!t1.equals(t2)) count++;
		    if (count > 1) break;
		}

		else if (s1.charAt(i) != s2.charAt(j)) {
		    System.out.println("DIFFERENT");
		    continue loop;
		}
	    }
		    
	    if (count == 1)
		System.out.println("CLOSE");
	    else
		System.out.println("DIFFERENT");
	}
    }
}
			   
		    

