import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String tmp = Integer.toString(i);
            if (tmp.length() % 2 != 0) cnt++;
        }
        System.out.println(cnt);
    }
}
