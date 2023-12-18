import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long[] t = new long[5];
        //        String s = sc.next();

        long ans = 5;
        long min = Long.MAX_VALUE;
        //        boolean ans = false;

        for (int i = 0; i < 5; i++) {
            t[i] = sc.nextLong();
            min = Math.min(min, t[i]);
        }

        //        if ((Math.abs(ant[0] - ant[1]) > k) )
        //            ans = true;

        sc.close();

        if (min >= n) {
            System.out.println(ans);
            return;
        } else {
            ans = n / min + 5;
            System.out.println(ans);
        }

        //        System.out.println(ans ? "Yes" : "No");

    }
}