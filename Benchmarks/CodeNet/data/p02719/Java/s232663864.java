public class Main {

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var n = sc.nextLong();
        var k = sc.nextLong();

        System.out.println(Math.min(n % k, Math.abs(n % k - k)));
    }

}
