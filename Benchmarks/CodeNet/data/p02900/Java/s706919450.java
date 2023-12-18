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
        double d = Math.sqrt(b);
        if ((a % 2 == 0) && (b % 2 == 0))
            c++;
        for (long i = 3; i<=d; i+=2) {
            if (a < i)
                break;
	    if ((a % 2 == 0) && (b % 2 == 0)) {
                double sqrtNum = Math.sqrt(i);
                boolean f = true;
                for (long j = 2; j<=sqrtNum; j++) {
                    if (i % j ==0) {
                        f = false;
                        break;
                    }
                }
                if (f)
                    c++;
            }
        }
        System.out.println(c);
    }
}