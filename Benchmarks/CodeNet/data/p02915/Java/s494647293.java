import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final int p = 1;
        switch (p) {
        case 1:
            A.answer();
            break;
        }
    }
}

class A {
    static void answer() {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int res = calc(n);
        System.out.println(res);
    }

    static int calc(final int n) {
        return n * n * n;
    }
}