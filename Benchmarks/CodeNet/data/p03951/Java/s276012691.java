import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        for(int i = 0; i < n; i++) {
        	if(s.charAt(i) == t.charAt(0)) {
        		String subS = s.substring(i+1, n);
        		String subT = t.substring(1, n - i);
        		if(subS.equals(subT)) {
        			System.out.println(n + i);
        			return;
        		}
        	}
        }
        System.out.println(n + n);
    }
}
