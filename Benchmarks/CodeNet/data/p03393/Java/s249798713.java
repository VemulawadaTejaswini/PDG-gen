import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        String result = "";
        String maxIndex = "zyxwvutsrqponmlkjihgfedcba";

        if (maxIndex.equals(s)) {
            result = "-1";

        } else {
            List<String> list = new ArrayList<>();
            char c = 'a';
            for (int i = 0; i < 26; i++) {
                list.add(String.valueOf((char) ((int) c + i)));
            }

            String[] array = s.split("");

            if (s.length() < 26) {
                for (String str : array) {
                    list.remove(list.indexOf(str));
                }
                result = s + list.get(0);

            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    if (array[i].equals(list.get(i))) {
                        sb.append(list.get(i));
                    } else {
                        sb.replace(i - 1, i, list.get(i));
                        break;
                    }
                }
                result = sb.toString();
            }
        }

        // 出力
        System.out.println(result);
    }
}
