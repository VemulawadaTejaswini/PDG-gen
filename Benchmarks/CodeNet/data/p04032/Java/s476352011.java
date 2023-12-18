import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // ee or eXe だけなのでそれがないかをチェック
        int s2Index = 0;
        int s1Index = 1;
        char s2 = s.charAt(s2Index); //2個前
        char s1 = s.charAt(s1Index); //1個前
        if (s1 == s2) {
            out.println(++s2Index + " " + ++s1Index);
            return;
        }


        for (int s0Index = 2; s0Index < s.length(); s0Index++) {
            char s0 = s.charAt(s0Index);

            // ee
            if (s1 == s0) {
                out.println(++s1Index + " " + ++s0Index);
                return;
            }

            // eXe
            if (s2 == s0) {
                out.println(++s2Index + " " + ++s0Index);
                return;
            }

            s2 = s1;
            s1 = s0;
        }

        out.println("-1 -1");
    }
}