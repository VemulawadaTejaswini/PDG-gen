import java.util.*;

public class Main {
    static int MOD = 1000000007;
	static int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        sc.close();

        String res = "";
        for (int i = 0; i < n; i++) {
            res += String.valueOf(s.charAt(i)) + String.valueOf(t.charAt(i));
        }
        
        System.out.println(res);
    }
}