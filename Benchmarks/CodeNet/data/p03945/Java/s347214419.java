import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int cnt = 0;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1) == s.charAt(i)) continue;
            cnt++;
        }
        
        System.out.println(cnt);
    }
}
