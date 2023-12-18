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
        Integer[] p = new Integer[a];
        for (int i = 0; i < a; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        Integer[] q = new Integer[b];
        for (int i = 0; i < b; i++) {
            q[i] = Integer.parseInt(sc.next());
        }
        Integer[] r = new Integer[c];
        for (int i = 0; i < c; i++) {
            r[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(p, Collections.reverseOrder());
        int[] eat = new int[x + y];
        for (int i = 0; i < x; i++) {
            eat[i] = p[i];
        }

        Arrays.sort(q, Collections.reverseOrder());
        for (int i = 0; i < y; i++) {
            eat[x + i] = q[i];
        }

        Arrays.sort(eat);
        Integer[] colorless = new Integer[c * 2];
        int colorlessSum = 0;
        for (int i = 0; i < c; i++) {
            colorless[i] = eat[i];
            colorlessSum += eat[i];
        }
        for (int i = 0; i < c; i++) {
            colorless[c + i] = r[i];
        }

        Arrays.sort(colorless, Collections.reverseOrder());
        int colorlessSum2 = 0;
        for (int i = 0; i < c; i++) {
            colorlessSum2 += colorless[i];
        }

        int diff = colorlessSum2 - colorlessSum;

        int sum = Arrays.stream(eat).sum();
        int result = 0 < diff ? sum + diff : sum;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
