public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.arch.data.model"));

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