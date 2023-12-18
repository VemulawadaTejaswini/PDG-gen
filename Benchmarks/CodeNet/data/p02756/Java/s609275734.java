import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        
        boolean reverse = false;
        while (q-- > 0) {
            int type1 = sc.nextInt();
            
            if (type1 == 1) {
                reverse = !reverse;
            } else {
                int type2 = sc.nextInt();
                String s = sc.next();
                
                if (type2 == 1) {
                    if (!reverse) {
                        str = s + str;
                    } else {
                        str = str + s;
                    }
                } else {
                    if (reverse) {
                        str = s + str;
                    } else {
                        str = str + s;
                    }
                }
            }
        }
        
        if (!reverse) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        } else {
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}