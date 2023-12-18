import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int result = 0;
        Set<String> set = new HashSet<>(Arrays.asList(s.split("")));
        while (1 < set.size()) {
            int[] count = new int[26];
            int[] dist = new int[26];
            int base = (int) 'a';

            count[(int) s.charAt(0) - base]++;
            count[(int) s.charAt(s.length() - 1) - base]++;
            for (int i = 1; i < s.length() - 1; i++) {
                int c = (int) s.charAt(i);
                count[c - base] += 2;
            }

            for (int i = 0; i < 26; i++) {
                String c = String.valueOf((char) ((int) 'a' + i));
                int index = s.indexOf(c);
                if (index < 0) {
                    continue;
                }
                dist[c.charAt(0) - base] = index;
                int next = s.indexOf(c, index + 1);
                if (next < 0) {
                    dist[c.charAt(0) - base] = Math.min(dist[c.charAt(0) - base], s.length() - index - 1);
                    continue;
                }
                dist[c.charAt(0) - base] = Math.min(dist[c.charAt(0) - base], s.length() - next - 1);
                while (0 < next) {
                    dist[c.charAt(0) - base] = Math.min(dist[c.charAt(0) - base], next - index);
                    index = next;
                    next = s.indexOf(c, index + 1);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                int left = (int) s.charAt(i - 1);
                int right = (int) s.charAt(i);
                if (count[left - base] < count[right - base]) {
                    sb.append(String.valueOf((char) right));
                } else if (count[right - base] < count[left - base]) {
                    sb.append(String.valueOf((char) left));
                } else {
                    if (dist[left - base] <= dist[right - base]) {
                        sb.append(String.valueOf((char) right));
                    } else {
                        sb.append(String.valueOf((char) left));
                    }
                }
            }

            s = sb.toString();
            set = new HashSet<>(Arrays.asList(s.split("")));
            result++;
        }

        // 出力
        System.out.println(result);
    }
}
