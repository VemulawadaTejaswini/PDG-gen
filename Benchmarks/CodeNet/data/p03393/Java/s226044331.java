import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 26) {
            if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
                System.out.println("-1");
                return;
            }
            int pos = 0;
            out: for (int k = 0; k < 26; k++) {
                for (int i = 0; i < 26; i++) {
                    for (int j = i + 1; j <= k; j++) {
                        if (s.charAt(26 - 1 - i) > s.charAt(26 - 1 - j)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(s);
                            sb.insert(26 - 1 - j, s.charAt(26 - 1 - i));
                            s = new String(sb).substring(0, 26 - j);
                            pos = j - 1;
                            break out;
                        }
                    }
                }
            }
            System.out.println(s);
            return;
        } else {
            for (int i = 'a'; i <= 'z'; i++) {
                if (!s.contains(String.valueOf((char) i))) {
                    s += String.valueOf((char) i);
                    break;
                }
            }
            System.out.println(s);
            return;
        }
    }
}