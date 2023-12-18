import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i, s.length());
            count = Math.max(getDoubleCount(s1, s2), count);
        }

        int result = count;

        // 出力
        System.out.println(result);
    }

    public static int getDoubleCount(String s1, String s2) {
        List<String> list1 = new ArrayList<>(new HashSet<>(Arrays.asList(s1.split(""))));
        List<String> list2 = new ArrayList<>(new HashSet<>(Arrays.asList(s2.split(""))));

        int count = 0;
        for (String s : list2) {
            if (list1.contains(s)) {
                count++;
            }
        }

        return count;
    }
}
