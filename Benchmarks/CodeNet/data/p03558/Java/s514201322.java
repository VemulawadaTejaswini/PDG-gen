import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        sc.close();
        long min = Long.MAX_VALUE;
        for (long i = 1; i < 100000; i++) {
            long l = k*i;
            long sum = 0;
            while (l > 0) {
                sum += l % 10;
                l /= 10;
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }

}
