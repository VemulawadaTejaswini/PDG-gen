import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] t = new String[]{"dream", "dreamer", "erase", "eraser"};
        
        int i = s.length();
        while(i > 0) {
            int j = 0;
            for(; j < t.length; j++) {
                String str = t[j];
                if(i - str.length() >= 0 && s.substring(i - str.length(), i).equals(str)) {
                    i = i - str.length();
                    break;
                }
            }
            if(j == t.length) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}
