import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] sC = s.toCharArray();
        char[] tC = t.toCharArray();
        char[] resC;

        resC = sC.clone();
        for(int i = 0; i < sC.length; i++) {
            if(sC[i] == tC[0]) {
                for(int j = i; j < sC.length; j++) {
                    if(sC[j] == tC[j - i] || sC[j] == '?') resC[j] = tC[j - i];
                    if(sC[j] != '?' && sC[j] != tC[j - i]) {
                        resC = new char[sC.length];
                        break;
                    }
                }
            }
        }

        if( Arrays.equals(sC, resC) ) {
            System.out.println("UNRESTORABLE");
            return;
        }
        for(int i = 0; i < resC.length; i++) {
            if(resC[i] == '?') resC[i] = 'a';
        }
        System.out.println(resC);
    }
}
