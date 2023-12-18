import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * TITLE : Banned K
 * URL : https://atcoder.jp/contests/abc159/tasks/abc159_d
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        HashMap<Integer, Numbers> map = new HashMap<Integer, Numbers>();
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            list.add(number);
            if (!map.containsKey(number)) {
                map.put(number, new Numbers());
            }
            else {
                map.get(number).value++;
            }
        }
        sc.close();

        int tmp = 0;
        for (Integer key : map.keySet()) {
            int value = map.get(key).value;
            map.get(key).comb = calcCombination(value, 2);
            tmp += map.get(key).comb;
        }

        for (int i = 0; i < list.size(); i++) {
            int sub = list.get(i);
            int answer = tmp;
            Numbers n = map.get(sub);
            answer -= n.comb;
            answer += calcCombination(n.value - 1, 2);
            System.out.println(answer);

        }
    }

    static int calcCombination(int n, int m) {
        if (n < m || m < 0) {
            return 0;
        }
        int c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }

    private static class Numbers {
        int value = 1;

        int comb;
    }
}
