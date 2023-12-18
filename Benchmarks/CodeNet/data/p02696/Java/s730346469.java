import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long result = 0;
        final long max = Math.min(b, n);
        List<Long> list = new ArrayList<>();
        double d = (double) max / b;
        long left = (long) Math.floor(d * a);
        long right = (long) Math.floor(d) * a;
        long num = left - right;
        list.add(num);
        result = Math.max(result, num);

        // 出力
        System.out.println(result);
    }
}
