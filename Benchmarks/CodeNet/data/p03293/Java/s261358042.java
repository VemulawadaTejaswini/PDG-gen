import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new	Scanner(System.in);
	char[] s = sc.next().toCharArray();
	char[] c = sc.next().toCharArray();
	Arrays.sort(s);
	Arrays.sort(c);
	for(int i = 0; i<s.length; i++) {
	    if(s[i]!=c[i]) {
            	System.out.println("No");
		return;
	    }
        }
	System.out.println("Yes");
    }
}
