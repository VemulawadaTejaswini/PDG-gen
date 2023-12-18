import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] list = new long[n + 1];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }
        list[n] = x;
        Arrays.sort(list);
        Set<Long> gaps = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            long gap = list[i + 1] - list[i];
            if (gap == 1) {
                System.out.println(gap);
                return;
            }
            gaps.add(list[i + 1] - list[i]);
        }

        Long[] gapsArray = gaps.toArray(new Long[0]);

        long ans = gapsArray[0];

        parent : for (int i = 0; i < gapsArray.length - 1 ; i++) {
            for (int j = i + 1; j < gapsArray.length; j++) {
                long gcd = gcd(gapsArray[j], gapsArray[i]);
                if (gcd < ans) {
                    ans = gcd;
                }
                if (ans == 1) {
                    break parent;
                }
            }
        }

        System.out.println(ans);

    }

    //最大公約数gcd
    public static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}