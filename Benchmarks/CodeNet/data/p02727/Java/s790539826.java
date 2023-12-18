import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        Long[] p = new Long[a];
        for (int i = 0; i < a; i++) {
            p[i] = Long.parseLong(sc.next());
        }
        Long[] q = new Long[b];
        for (int i = 0; i < b; i++) {
            q[i] = Long.parseLong(sc.next());
        }
        Long[] r = new Long[c];
        for (int i = 0; i < c; i++) {
            r[i] = Long.parseLong(sc.next());
        }

        // 主処理
        Arrays.sort(p, Collections.reverseOrder());
        Long[] eat = new Long[x + y];
        for (int i = 0; i < x; i++) {
            eat[i] = p[i];
        }

        Arrays.sort(q, Collections.reverseOrder());
        for (int i = 0; i < y; i++) {
            eat[x + i] = q[i];
        }

        Arrays.sort(eat);
        Long[] colorless = new Long[c * 2];
        long colorlessSum = 0;
        for (int i = 0; i < c; i++) {
            colorless[i] = eat[i];
            colorlessSum += eat[i];
        }
        for (int i = 0; i < c; i++) {
            colorless[c + i] = r[i];
        }

        Arrays.sort(colorless, Collections.reverseOrder());
        long colorlessSum2 = 0;
        for (int i = 0; i < c; i++) {
            colorlessSum2 += colorless[i];
        }

        long diff = colorlessSum2 - colorlessSum;

        long sum = Arrays.stream(eat).mapToLong(n -> n).sum();
        long result = 0 < diff ? sum + diff : sum;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
