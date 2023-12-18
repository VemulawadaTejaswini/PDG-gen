public class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long h = sc.nextLong();
        long ans = func(h);
        System.out.println(ans);
    }
    public static long func(long x) {
        if (x == 1) return 1;
        return func(x / 2) * 2 + 1;
    }
}