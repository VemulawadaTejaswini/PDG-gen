public class Bench1 {
    public static void main(String[] args) {
        long x = (1L << 32) - 1 ;
        long n = (int)1e8;
        long p = 1;

        for (int i = 1; i <= n; i++) {
            p += i;
            p %= x;
        }

        System.out.println(p);
    }   
}