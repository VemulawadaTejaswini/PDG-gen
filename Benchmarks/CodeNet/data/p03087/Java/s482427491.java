import java.util.*;

public class Main {
    
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        
        for (int i = 0; i < Q; ++i) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            String targetStr = S.substring(l -1, r);
            int cnt = (targetStr.length() - targetStr.replaceAll("AC", "").length()) / 2;
            System.out.println(cnt);
        }
        
    }
}
