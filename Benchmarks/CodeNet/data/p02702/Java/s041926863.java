import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();

        long[] dp = new long[s.length()+1];

        long[] remain = new long[2019];


        int l = 0;

        long ans = 0;

        for (int i=0; i<s.length()-4; i++) {
            String sub = s.substring(i, i+5);
            if (Long.parseLong(sub) % 2019 == 0) {
                ans++;
            }
        }
        for (int i=0; i<s.length()-5; i++) {
            String sub = s.substring(i, i+6);
            if (Long.parseLong(sub) % 2019 == 0) {
                ans++;
            }
        }
        for (int i=0; i<s.length()-6; i++) {
            String sub = s.substring(i, i+7);
            if (Long.parseLong(sub) % 2019 == 0) {
                ans++;
            }
        }



        System.out.println(ans);

    }
}
