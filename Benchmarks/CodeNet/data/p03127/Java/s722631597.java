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
        Arrays.sort(a);
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        while (list.size() != 1) {
            int min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                list.set(i, list.get(i) % min);
            }
            list = list.stream().sorted().filter(j -> j != 0).collect(Collectors.toList());
        }
        int result = list.get(0);

        // 出力
        System.out.println(result);
    }
}
