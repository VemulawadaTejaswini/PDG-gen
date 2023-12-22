import java.util.*;

class Main {
        public static void main(String args[]) {
                try(Scanner sc = new Scanner(System.in)) {
                        int N = sc.nextInt();
                        long min = 1 << 60;
                        long ans = - (1 << 60);
                        for (int i = 0; i < N; i++) {
                                long now = sc.nextLong();
                                ans = Math.max(ans, now - min);
                                min = Math.min(min, now);
                        }
                        System.out.println(ans);
                }
        }
}