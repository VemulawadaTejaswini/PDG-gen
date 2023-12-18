import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == r.charAt(i) ) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }    
}
