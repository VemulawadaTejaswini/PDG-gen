import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        int l = S.length();
        String ans = "Yes";
        int[] A_S = new int[26];
        int[] A_T = new int[26];

        for (int i = 0; i < 26; i++) {
            A_S[i] = -1;
            A_T[i] = -1;
        }

        for (int i = 0; i < l; i++) {
            if (A_S[(char)S.charAt(i) - 'a'] == -1) {
                A_S[(char)S.charAt(i) - 'a'] = (char)T.charAt(i) - 'a';
            }
            else if (A_S[(char)S.charAt(i) - 'a'] != (char)T.charAt(i) - 'a') {
                ans = "No";
                // System.out.println("S -> T");
                break;
            }
        }

        for (int i = 0; i < l; i++) {
            if (A_T[(char)T.charAt(i) - 'a'] == -1) {
                A_T[(char)T.charAt(i) - 'a'] = (char)S.charAt(i) - 'a';
            }
            else if (A_T[(char)T.charAt(i) - 'a'] != (char)S.charAt(i) - 'a') {
                ans = "No";
                // System.out.println("T -> S");
                break;
            }
        }

        System.out.println(ans);       
        scan.close();
    }
}