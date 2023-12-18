import java.util.*;

public class Main {
        static int RMAX = 100001;
        static boolean[] primes = new boolean[RMAX];
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int Q = sc.nextInt();
                e();
                for (int i = 0; i < Q; i++) {
                        int l = sc.nextInt();
                        int r = sc.nextInt();
                        int counter = 0;
                        for (; l <= r; l++) {
                                if (!primes[l]) continue;
                                if (!primes[(l + 1) / 2]) continue;
                                counter++;
                        }
                        System.out.println(counter);
                }
        }

        static void e() {
                for (int i = 2; i < RMAX; i++) {
                        primes[i] = true;
                }
                for (int i = 2; i < RMAX; i++) {
                        if (!primes[i]) {
                                continue;
                        }
                        for (int j = 2; j * i < RMAX; j++) {
                                primes[i * j] = false;
                        }
                }
        }
}
