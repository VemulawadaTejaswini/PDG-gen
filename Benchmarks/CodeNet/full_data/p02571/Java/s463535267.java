import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
    
        System.out.println(dirrerentString(S,T));
    }
    
    private static int dirrerentString(String p, String c) {
        int different = 1001;
        for (int i=0; i<=p.length()-c.length(); i++) {
            int d = dirrerentLetter(c, p.substring(i, i+c.length()));
            if (d < different) {
                different = d;
                if (different == 0) {
                    break;
                }
            }
        }
        return different;
    }
    
    private static int dirrerentLetter(String s1, String s2) {
        int result = 0;
        for (int i=0; i<s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
