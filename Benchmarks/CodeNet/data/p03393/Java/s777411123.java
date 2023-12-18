import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String ans = solve(S);

        if (ans != null) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }

    }

    private static String solve(String S) {
        char[] ans = new char[26];
        char[] slist = S.toCharArray();
        boolean[] hit = new boolean[26];

        for (int i=0; i<slist.length; i++) {
            hit[slist[i] - 'a'] = true;
        }

        if (slist.length != 26) {
            char c = 'a';
            for (int i=0; i<hit.length; i++) {
                if (!hit[i]) {
                    c = (char) ('a' + i);
                    break;
                }
            }

            return S.concat(String.valueOf(c));
        }

        hit = new boolean[26];
        for (int i=25; i>=0; i--) {
//            System.err.print(i + ":" + slist[i] + " ");
            for (int j=(slist[i] - 'a' + 1); j<26; j++) {
//                System.err.print(j + " ");
                if(hit[j]) {
                    slist[i] = (char)('a' + j);
                    return new String(slist).substring(0, i+1);
                }
            }

//            System.err.println("(" + i + ": add " + (slist[i]) + ")");
            hit[slist[i]-'a'] = true;
        }

        return null;
    }
}
