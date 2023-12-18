import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        String[] num = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        List<String> list = new ArrayList<>(Arrays.asList(num));
        for (int i = 0; i < 100000; i++) {
            String s = list.get(i);
            long last = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1)));
            if (last != 0) {
                list.add(s + (last - 1));
            }
            list.add(s + last);
            if (last != 9) {
                list.add(s + (last + 1));
            }
        }
        String result = list.get(n - 1);

        // 出力
        System.out.println(result);
    }
}
