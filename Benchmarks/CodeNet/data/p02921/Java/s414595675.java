import java.util.*;

class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int A = 0;
        
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        for (int i = 0; i < 3; i++) {
            if (s[i] == t[i]) {
                A++;
            }
        }
        System.out.println(A);
    }
}