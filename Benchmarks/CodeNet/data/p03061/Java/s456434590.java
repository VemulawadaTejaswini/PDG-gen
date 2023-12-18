import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long[] Ai = new Long[N];
        Long maxGcd = 0L;

        for (int i=0; i<N; i++) {
            Ai[i] = sc.nextLong();
        }
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (i == j) continue;
                Long temp = gcd(Ai[i], Ai[j]);
                if (maxGcd < temp) {
                    maxGcd = temp;
                }
            }
        }

        System.out.println(maxGcd);
    }

    public static Long gcd(Long m, Long n) {
        Long temp;
        while (m % n != 0) {
            temp = n;
            n = m % n;
            m = temp;
        }
        return n;
    }
}