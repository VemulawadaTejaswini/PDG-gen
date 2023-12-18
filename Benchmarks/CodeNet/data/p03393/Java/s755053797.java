import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = -1;
        int m = -1;
        char[] ab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean[] flg = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (s.charAt(i) == ab[j]) {
                    flg[j] = true;
                    if (i == s.length() - 1) {
                        n = j;
                    } else if (i == s.length() - 2) {
                        m = j;
                    }
                }
            }
        }
        
        if (s.length() == 26) {
            if (s == "zyxwvutsrqponmlkjihgfedcba") {
                System.out.println(-1);
            } else {
                boolean[] flg2 = new boolean[26];
                boolean b = true;
                int[] array = new int[26];
                int o = -1;
                boolean f = true;
                for (int i = 25; i >= 0; i--) {
                    for (int j = 0; j < 26; j++) {
                        if (s.charAt(i) == ab[j]) {
                            flg2[j] = true;
                            array[i] = j;
                            if (j < o && f) {
                                System.out.print(s.substring(0, i));
                                System.out.println(ab[o]);
                                f = false;
                                break;
                            }
                        }
                    }
                    for (int j = 0; j < 26; j++) {
                        if (flg2[j] == true) {
                            if (f) {
                            o = Math.max(o, j);
                            }
                        }
                    }
                }
            }
        } else {
            System.out.print(s);
            for (int i = 0; i < 26; i++) {
                if (flg[i] == false) {
                    System.out.println(ab[i]);
                    break;
                }
            }
        }
    }
}
