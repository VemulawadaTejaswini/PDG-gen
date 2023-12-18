import java.util.Scanner;

class A {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        System.out.println(N % 2 == 0 ? N / 2 - 1 : N / 2);
    }
}
public class Main {
    public static void main(String...args) {
        A.main();
    }
}
