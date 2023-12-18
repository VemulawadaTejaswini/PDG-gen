import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String[] s = S.split("");
        String[] t = T.split("");
        for(int i=0; i<s.length; i++) {
            if(s[i].equals(t[i])) {
                continue;
            }else {
                S = S.replaceAll(t[i], "#");
                S = S.replaceAll(s[i], t[i]);
                S = S.replaceAll("#", s[i]);
                s = S.split("");
            }
        }
        if(S.equals(T)) System.out.println("Yes");
        else System.out.println("No");
    }

}
