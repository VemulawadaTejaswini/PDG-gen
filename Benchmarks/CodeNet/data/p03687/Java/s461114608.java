import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            char key = s.charAt(i);
            Integer v = map.get(key);
            map.put(key, v == null ? 1 : ++v);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char v = s.charAt(i);
            String t = s;
            while (true) {
                boolean isOK = true;
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < t.length() - 1; j++) {
                    if (t.charAt(j) != v) {
                        isOK = false;
                    }
                    if (t.charAt(j + 1) == v) {
                        builder.append(v);
                    } else {
                        builder.append(t.charAt(j));
                    }
                }
                if (isOK) {
                    if (t.charAt(t.length() - 1) != v) {
                        count++;
                    }
                    ans = Math.min(count, ans);
                    break;
                }
                t = builder.toString();
                count++;
            }
        }
        System.out.println(ans);
    }
}