import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        Integer[] d = new Integer[n];
        Arrays.setAll(d, i -> Integer.parseInt(sc.next()));
        List<Integer> list = new ArrayList<>(Arrays.asList(d));

        int m = Integer.parseInt(sc.next());
        boolean judge = true;
        for (int i = 0; i < m; i++) {
            int t = Integer.parseInt(sc.next());
            if (!list.contains(t)) {
                judge = false;
                break;
            } else {
                int index = list.indexOf(t);
                list.remove(index);
            }
        }
        sc.close();

        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
