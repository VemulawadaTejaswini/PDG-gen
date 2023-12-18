import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        String ans = "UNRESTORABLE";

        if (s.contains(t)) {
            ans = s.replace("?", "a");
        } else {
            String[] tList = t.split("");
            for (int i = 0; i <= s.length() - t.length(); i++) {
                String[] value = s.substring(i, i + t.length()).split("");
                boolean isOK = true;
                for (int j = 0; j < t.length(); j++) {
                    if (!(tList[j].equals(value[j]) || value[j].equals("?"))) {
                        isOK = false;
                        break;
                    }
                }
                if (isOK) {
                    String kouho = s.substring(0, i) + t + s.substring(i + t.length()).replace("?", "a");
                    if (ans.equals("UNRESTORABLE") || kouho.compareTo(ans) < 0) {
                        ans = kouho;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}