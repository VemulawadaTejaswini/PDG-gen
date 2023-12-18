import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        // 与式を変形するとfloor(A(x%B)/B)
        // したがって、x = b - 1の時に与式は最大となる。
        long x = b - 1 <= n ? b - 1 : n;
        System.out.println(((a * (x % b)) - (a * (x % b) % b)) / b);
    }
}
