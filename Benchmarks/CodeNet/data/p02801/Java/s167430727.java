import java.util.*;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        int CI = S[0] - 'a';
        char[] alpha = new char[26];
        char ch = 'a';
        for (int i = 0; i < 26; i++){
            alpha[i] = ch++;
        }

        System.out.println(alpha[CI + 1]);
    }
}
