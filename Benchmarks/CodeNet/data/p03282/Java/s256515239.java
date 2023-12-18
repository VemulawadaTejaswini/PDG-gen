import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        if(k == 1) {
            System.out.println(s.charAt(0));
            return;
        }
            
        int idx = 0;
        while(idx < s.length()) {
            if(s.charAt(idx) != '1')
                break;
        }
        System.out.println(s.charAt(idx));
    }
}
