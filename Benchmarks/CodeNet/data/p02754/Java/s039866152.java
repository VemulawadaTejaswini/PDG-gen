public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = n / (a+b);
        long d = n % (a+b);
        if(c < 1) {
            System.out.println(Math.min(a, n));
        } else {
            long e = n % (c*(a+b));
            long f = Math.min(e, b);
            System.out.println(c * a + f);
        }
    }
}