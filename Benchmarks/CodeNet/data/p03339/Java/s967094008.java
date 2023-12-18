import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	String s = scan.next();
    	int ans = 99999999;
    	for (int i=0;i < n;i++) {
    		int cnt = 0;
    		String left = s.substring(0, i);
    		String right = s.substring(i+1, n);
    		for (char c : left.toCharArray()) if (c=='W') cnt++;
    		for (char c : right.toCharArray()) if (c=='E') cnt++;
    		if (cnt < ans) ans = cnt;
    	}
    	System.out.println(ans);
    }
}