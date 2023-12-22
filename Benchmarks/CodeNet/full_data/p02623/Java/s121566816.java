import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        long sum = 0;

        Queue<Integer> queA = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queA.add(sc.nextInt());
        }
        Queue<Integer> queB = new ArrayDeque<>();
        for (int j = 0; j < m; j++) {
            queB.add(sc.nextInt());
        }

        while (sum <= (long)k) {
            int read = 0;
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
            } else if (queA.peek() <= queB.peek()) {
                read = queA.poll();
            } else {
                read = queB.poll();
            }

            sum = sum + (long)read;
            // 読む本の合計がk分を超えたとき、終わり
            if (sum > (long)k) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}