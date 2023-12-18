import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0 ; i < m ; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        for (int i = 0 ; i < m ; i ++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + b[i]);
            } else {
                map.put(c[i], b[i]);
            }
        }
        Pair[] pairs = new Pair[map.size()];
        int index = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            Pair pair = new Pair();
            pair.from = entry.getKey();
            pair.end = entry.getValue();
            pairs[index] = pair;
            index++;
        }

        Arrays.sort(pairs);
        long sum = 0 ;
        int remain = n;
        for (int i = map.size() - 1 ; i >= 0 ; i--) {
            if (pairs[i].end < remain) {
                sum += (long) pairs[i].from * pairs[i].end;
                remain -= pairs[i].end;
                } else {
                    sum += (long) pairs[i].from * remain;
                    remain = 0;
                }

            if (remain == 0) break;
        }

        System.out.println(sum);


    }



}

class Pair implements Comparable {
    int from;
    int end;
    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        return from - otherpair.from;
    }
}

