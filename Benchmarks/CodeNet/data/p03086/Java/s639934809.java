import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int max = 0;
        for (int i = 0; i < S.length(); i++) {
            int j = i;
            while( j < S.length() && isACGT(S.charAt(j))){
                j++;
            }
            max = Math.max(max, j - i);
        }

        out.println(max);
    }

    public static boolean isACGT(char a) {
        return a == 'A' || a == 'C' || a == 'G' || a == 'T';
    }
}