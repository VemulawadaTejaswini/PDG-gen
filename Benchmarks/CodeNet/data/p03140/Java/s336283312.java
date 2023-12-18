import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        
        String buf = "";
        
        for (int i = 0; i < n; i++) {
            char tmp = a.charAt(i);
            if (b.charAt(i) == c.charAt(i))
                tmp = b.charAt(i);
            buf += tmp;
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (buf.charAt(i) != a.charAt(i))
                cnt++;
            if (buf.charAt(i) != b.charAt(i))
                cnt++;
            if (buf.charAt(i) != c.charAt(i))
                cnt++;
        }

        System.out.println(cnt);
    }
}