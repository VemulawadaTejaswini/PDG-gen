import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        int cnt = 0;

        for (int i=0; i<s.length; i++) {
            if (s[i]!=t[i]) cnt++;
        }

        System.out.print(cnt);
    }
}
