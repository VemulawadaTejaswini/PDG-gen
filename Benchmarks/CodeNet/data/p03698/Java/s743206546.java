import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int n = c.length;
        
        Set<String> set = new HashSet<String>();
        
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            int old = set.size();
            String tmp = String.valueOf(c[i]);
            set.add(tmp);
            
            if (set.size() == old) ok = false;
        }
        
        if (ok) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}