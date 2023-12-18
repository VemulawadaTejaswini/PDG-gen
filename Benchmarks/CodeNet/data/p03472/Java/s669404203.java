import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Pair[] pairs = new Pair[n];
         for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            Pair p = new Pair();
            p.a = a[i];
            p.b = b[i];
            pairs[i] = p;
        }

         Arrays.sort(a);

         int aMax = a[n - 1];

         Arrays.sort(pairs);

         int count = 0;
         for (int i = n - 1 ; i >= 0 ; i--) {
             if (h > 0 && pairs[i].b > aMax) {
                 count++;
                 h -= pairs[i].b;
             }
         }

         if (h <= 0) {
             System.out.println(count);
         } else {
             int mod = h / aMax;
             h -= aMax * mod;
             count += mod;
             if (h > 0) {
                 count++;
             }
             System.out.println(count);
         }


    }

}

class Pair implements Comparable {
    int a;
    int b;
    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        return b - otherpair.b;
    }
}
