import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long yen = 0;
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        long a[] = new long[N];
        int b[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        while (M > 0) {
            long min = Long.MAX_VALUE;
            int minA = -1;
            for (int i = 0; i < N; i++) {
                long var = a[i];
                if (var <= min && var >= 1 && b[i] != 0) {
                    min = var;
                    minA = i;
                }
            }
            while (b[minA] > 0 && M > 0) {
                yen += a[minA];
                if(b[minA] == 0){
                    a[minA] = 0;
                }
                --b[minA];
                --M;
            }
        }
        System.out.println(yen);
    }
}