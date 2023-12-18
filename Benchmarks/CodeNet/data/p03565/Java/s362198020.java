import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char[] c1 = str1.toCharArray();
        String str2 = sc.next();
        char[] c2 = str2.toCharArray();
        
        if (c1.length < c2.length) {
            System.out.println("UNRESTORABLE");
            return;
        }
        
        boolean ok = false;
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                // System.out.println(c1[(i+j)] + " "+ c2[j]);
                if (c1[i+j] == '?') {
                    
                } else if (c1[i+j] != c2[j]) {
                    break;
                }
                
                if (j == c2.length - 1) {
                    ok = true;
                    for (int k = 0; k < c2.length; k++) {
                        c1[i+k] = c2[k];
                    }
                }
                
                
                if (ok) break;
            }
            
            if (ok) break;
        }
        
        if (!ok) {
            System.out.println("UNRESTORABLE");
            return;
        }
        
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == '?') c1[i] = 'a';
            System.out.print(c1[i]);
        }
        System.out.println();
        
    }
}