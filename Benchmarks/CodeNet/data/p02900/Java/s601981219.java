import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());

        long a = A;
        long b = B;
        if (A > B) {
            a = B;
            b = A;
        }
        int c = 1;
        if ((a % 2 == 0) && (b % 2 == 0))
            c++;
        for (long i = 3; i<100000000000L; i++) {
            if (i % 2 == 0)
                continue;
            if (a < i)
                break;
            if ((a % i == 0) && (b % i == 0))
                c++;
        }
        System.out.println(c);
    }
}