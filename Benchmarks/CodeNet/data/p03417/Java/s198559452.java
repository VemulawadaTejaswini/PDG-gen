import java.util.Scanner;

class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long m = in.nextLong();
        long n = in.nextLong();

        long out = Math.abs((n - 2) * (m - 2));
        System.out.println(out);
    }
}
