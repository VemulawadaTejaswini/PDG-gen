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
        while(idx < s.length() && idx < k-1) {
            if(s.charAt(idx) != '1')
                break;
            idx++;
        }
        System.out.println(idx == s.length() ? 1 : s.charAt(idx));
    }
}
