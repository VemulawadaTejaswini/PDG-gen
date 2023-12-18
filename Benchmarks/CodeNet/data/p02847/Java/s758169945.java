import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long A = Long.parseLong(sc.next());
        final long B = Long.parseLong(sc.next());
        final long X = Long.parseLong(sc.next());
        sc.close();

        long N;
        long m;
        long L = X/A;
        if (L>1000000000)
            L=1000000000;
        for (N=L; N>0; N--) {
            m = A*N+B*(Long.toString(N).length());
            if (m<=X) {
                break;
            }
        }
        System.out.println(N);
    }
}
