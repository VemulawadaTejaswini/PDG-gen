import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        char[] c1 = str1.toCharArray();
        String str2 = sc.next();
        char[] c2 = str2.toCharArray();
        
        String str = "";
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (!ok) {
                str = c1[n-1-i] + str + c2[i];
                continue;
            }
            
            if (c1[n-1-i] == c2[i]) {
                str += c2[i];
            } else {
                ok = false;
                str = c1[n-1-i] + str + c2[i];
            }
        }
        
        System.out.println(str.length());
    }
}