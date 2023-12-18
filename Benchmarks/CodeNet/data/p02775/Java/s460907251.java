import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int cnt = 0;
        int u = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int m = n.charAt(i) - '0';
            if (m + u <= 5) cnt += m + u;
            else if (m + u <= 9) cnt += 10 - (m + u);
            else u = 1;
        }
        if (u == 1) cnt++;
        System.out.println(cnt);
    }
}