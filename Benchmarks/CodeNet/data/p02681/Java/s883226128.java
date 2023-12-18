import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char c[] = str.toCharArray();
        int n = c.length;
        String str2 = sc.next();
        
        char c2[] = str2.toCharArray();
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (c[i] != c2[i]) {
                ok = false;
            }
        }
        if (ok) {
        System.out.println("Yes");
        } else {
            
        System.out.println("No");
        }
    }
}
