import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        // 主処理
        Map<String, String> map = new HashMap<>();

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        for (int i = 0; i < arrayS.length; i++) {
            if (arrayS[i] != arrayT[i]) {
                map.put(String.valueOf(arrayS[i]), String.valueOf(arrayT[i]));
                if (!map.containsKey(String.valueOf(arrayT[i]))) {
                    map.put(String.valueOf(arrayT[i]), String.valueOf(arrayS[i]));
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            String c = String.valueOf((char) ((int) 'a' + i));
            if (!map.containsKey(c)) {
                map.put(c, c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : arrayS) {
            sb.append(map.get(String.valueOf(c)));
        }
        boolean judge = t.equals(sb.toString());
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
