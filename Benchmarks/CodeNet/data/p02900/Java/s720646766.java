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
        outside: for (long i = 3; i<100000000000L; i+=2) {
            if (i % 2 == 0)
                continue;
            if (a < i)
                break;
            double sqrtNum = Math.sqrt(i);
            for (long j = 3; j<=sqrtNum; j+=2) {
                if (i % j ==0)
                    continue outside;
            }
            if ((a % i == 0) && (b % i == 0)) {
                c++;
            }
        }
        System.out.println(c);
    }
}