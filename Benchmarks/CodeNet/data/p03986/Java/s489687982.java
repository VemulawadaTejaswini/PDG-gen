import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        int l = 0;
        for (int i = 10000;i > 0;) {
            l = s.length();
            String t = st(i);
            s = s.replace(t,"");
            if (l==s.length()) {
                i /= 2;
            }
        }
        
        System.out.println(s.length());
    }
    
    private static String st(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < n;i++) sb.append('S');
        for (int i = 0;i < n;i++) sb.append('T');
        return sb.toString();
    }
}
