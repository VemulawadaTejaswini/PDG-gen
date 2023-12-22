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

        for (int i=0; i<s.length(); i++) {
            int t = Integer.parseInt(s.substring(i, i+1));
            for (int j=0; j<remain.length; j++) {
                int tmp = 10 * j + t;
                tmp %= 2019;
                remain[tmp]++;
            }
        }



        System.out.println(remain[0]);

    }
}
