public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();
        if(x >= k * d) {
            System.out.println(x - k * d);
            return;
        }
        long min = x % d;
        long count = x / d;
        if((k - count) % 2 == 0) {
            System.out.println(min);
        } else {
            System.out.println(d - min);
        }
    }
}