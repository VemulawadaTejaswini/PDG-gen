import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int min = Arrays.stream(a).mapToInt(i -> i).min().getAsInt();
        for (int i = 1; i < a.length; i++) {
            if (a[i] % min == 0) {
                a[i] = 0;
            }
        }
        List<Integer> list = Arrays.stream(a).filter(i -> i != 0).collect(Collectors.toList());

        int result = list.size() == 1 ? list.get(0) : 1;

        // 出力
        System.out.println(result);
    }
}
