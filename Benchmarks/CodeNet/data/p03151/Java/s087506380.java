import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sumA = 0; long sumB = 0;
       Pair[] pairs = new Pair[n];
       int[] aa = new int[n];
       int[] ba = new int[n];
       for (int i = 0 ; i < n ; i++) {
           aa[i] = sc.nextInt();

       }
       for (int i = 0 ; i < n ; i++) {
           ba[i] = sc.nextInt();

       }
        for (int i = 0 ; i< n ; i++) {
            int a = aa[i];
            int b = ba[i];
            int dif = a -b;
            sumA += a;
            sumB += b;
            Pair pair = new Pair();
            pair.a = a;
            pair.b = b;
            pair.dif = dif;
            pairs[i] = pair;
        }
        if (sumA  < sumB) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(pairs);
        long difTotal = 0;
        int count = 0;
        for (int i = 0 ; i < n ; i ++) {
            if (pairs[i].dif < 0) {
                difTotal += pairs[i].dif;
                count++;
            }
        }
        for (int i = n - 1 ; i >= 0 ; i--) {
            if (difTotal < 0) {
                difTotal += pairs[i].dif;
                count++;
             } else {
                 System.out.println(count);
                 return;
             }

        }


        System.out.println(count);
    }

}

class Pair implements Comparable<Object> {
    int a;
    int b;
    int dif;
    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        return dif - otherpair.dif;
    }
}