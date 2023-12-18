import java.util.Arrays;
import java.util.Scanner;

class C {
    static class T implements Comparable<T>{
        long A, B, S;

        public T(long a, long b) {
            A = a;
            B = b;
            S = A + B;
        }

        @Override
        public int compareTo(T o) {
            return -Long.compare(S, o.S);
        }
    }

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final T[] ts = new T[N];
        final long[] B = new long[N];
        for(int i = 0; i < N; i++)
            ts[i] = new T(sc.nextLong(), sc.nextLong());
        Arrays.sort(ts);
        long ans = 0;
        for(int i = 0; i < N; i++)
            if(i % 2 == 0)
                ans += ts[i].A;
            else
                ans -= ts[i].B;
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
