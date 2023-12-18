import java.util.*;

class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] cs = new char[S.length()];
        int count = 0;

        for (int i=0; i<S.length(); i++) {
            cs[i] = S.charAt(i);
        }

        for (int i=1; i<S.length(); i++) {
            if (cs[i-1] == cs[i]) {
                count++;
                cs[i] = reverse(cs[i]);
            }
        }
        System.out.println(count);
    }

    static public char reverse(char c) {
        if (c == '0') {
            return '1';
        } else {
            return '0';
        }
    }
}
