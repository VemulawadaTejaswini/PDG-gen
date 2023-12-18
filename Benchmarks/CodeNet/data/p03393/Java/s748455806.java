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
            List<String> alphabets = new ArrayList<>();
            char c = 'a';
            for (int i = 0; i < 26; i++) {
                alphabets.add(String.valueOf((char) ((int) c + i)));
            }

            if (s.length() == 26) {
                List<String> list = new ArrayList<>();
                StringBuilder sb = new StringBuilder(maxIndex);
                for (int i = 0; i < 25; i++) {
                    list.add(sb.toString());
                    sb.deleteCharAt(sb.length() - 1);
                }

                for (int i = 25; 0 < i; i--) {
                    char left = s.charAt(i - 1);
                    char right = s.charAt(i);
                    if (left < right) {
                        if (list.contains(s.substring(i))) {
                            alphabets.remove(alphabets.indexOf(String.valueOf(s.charAt(i - 1))));
                        }
                        s = s.substring(0, i - 1);
                        break;
                    }
                }
            }

            if (!s.isEmpty()) {
                String[] array = s.split("");
                for (int i = 0; i < array.length; i++) {
                    alphabets.remove(alphabets.indexOf(array[i]));
                }
            }
            result = s + alphabets.get(0);
        }

        // 出力
        System.out.println(result);
    }

    public static List<String> permutation(String q) {
        return permutation(q, "");
    }

    private static List<String> permutation(String q, String ans) {
        List<String> list = new ArrayList<>();
        if (q.length() <= 1) {
            list.add(ans + q);
        } else {
            for (int i = 0; i < q.length(); i++) {
                list.addAll(permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i)));
            }
        }
        return list;
    }

}
