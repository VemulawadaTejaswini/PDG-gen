// コンパレータを定義したクラスを利用する方法
// 参考 -> #4526040

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        V[] ab = new V[n];

        for (int i = 0; i < n; i++) {
            ab[i] = new V(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(ab);

        long totalPrice = 0;
        int totalCnt = 0;
        for (int i = 0; i < n; i++) {
            long price = ab[i].a;
            int count = ab[i].b;

            if (count >= m - totalCnt) {
                totalPrice += (m - totalCnt) * price;
                break;
            } else {
                totalPrice += count * price;
                totalCnt += count;
            }
        }

        System.out.println(totalPrice);
    }

    static class V implements Comparable<V> {
        int a, b;

        V (int a, int b) {
            this.a = a;
            this.b = b;
        }

        // aの値でソート
        public int compareTo(V o) {
            return a - o.a;
        }
    }
}
