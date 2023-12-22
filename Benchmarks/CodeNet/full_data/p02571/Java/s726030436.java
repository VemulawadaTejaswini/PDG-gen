import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        int res = 100000;

        for (int i=0; i<s.length - t.length + 1; i++) {
            int cnt = 0;
            for (int j=0; j<t.length; j++) {
                if (s[i+j] != t[j]) cnt++;
            }
            res = Math.min(res, cnt);
        }

        System.out.print(res);

    }

}

