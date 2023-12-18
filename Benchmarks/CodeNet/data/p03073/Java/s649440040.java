import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        solve(s);
    }

    static void solve(String s) {
    	StringBuilder sb1 = new StringBuilder();

    	for(int i = 0; i < s.length(); i++) {
    		if(i % 2 == 0) {
    			sb1.append('1');
    		} else {
    			sb1.append('0');
    		}
    	}
    	String p1 = sb1.toString();

    	StringBuilder sb2 = new StringBuilder();
    	for(int i = 0; i < s.length(); i++) {
    		if(i % 2 == 0) {
    			sb2.append('0');
    		} else {
    			sb2.append('1');
    		}
    	}
    	String p2 = sb2.toString();
    	int ans = Math.min(countDiff(s,p1), countDiff(s,p2)) ;
    	System.out.println(ans);
    }

    static int countDiff(String s, String p) {
    	int count = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) != p.charAt(i)) count++;
    	}
    	return count;
    }
}