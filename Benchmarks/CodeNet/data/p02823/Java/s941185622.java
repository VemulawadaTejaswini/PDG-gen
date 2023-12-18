import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long N = Long.parseLong(sc.next());
        final long A = Long.parseLong(sc.next());
        final long B = Long.parseLong(sc.next());
        sc.close();

        long ans = 0;
        if (A%2==B%2) {
            ans = (B-A)/2;
        } else if (B<=(double)N/2) {
            ans = B-1;
        } else if ((double)N/2<=A) {
            ans = N-A;
        } else if(A-1>N-B) {
            ans = N-A;
        } else {
            ans = B-1;
        }

        System.out.println(ans);
    }
}