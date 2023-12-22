import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        long count = 0;
        long sum = 0;

        Queue<Long> queA = new ArrayDeque<>();
        for (long i = 0; i < n; i++) {
            queA.add(sc.nextLong());
        }
        Queue<Long> queB = new ArrayDeque<>();
        for (long j = 0; j < m; j++) {
            queB.add(sc.nextLong());
        }

        for (long t = 0; t < n + m; t++) {
            long read = 0;
            // A,Bが0の時
            if (queA.size() == 0 && queB.size() == 0) {
                break;
            }
            // Aが0の時
            if (queA.size() == 0) {
                // Bを読む
                read = queB.poll();
                // Bが0の時
            } else if (queB.size() == 0) {
                // Aを読む
                read = queA.poll();
                // Aの一番上の分数がBの一番上の分数より短いとき読む本を決める
            } else if (queA.peek() < queB.peek()) {
                read = queA.poll();
            } else {
                read = queB.poll();
            }

            sum = sum + read;
            // 読む本の合計がk分を超えたとき、終わり
            if (sum >  k) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}