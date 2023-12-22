import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int N = sc.nextInt();
                        int minv = 1000001, maxv = 0, sumv = 0;
                        for (int i = 0; i < N; i++) {
                                int x = sc.nextInt();
                                minv = Math.min(x, minv);
                                maxv = Math.max(x, maxv);
                                sumv += x;
                        }
                        System.out.println(minv + " " + maxv + " " + sumv);
                }
        }
}