import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length; i++) {
            if(i % 2 == 0) ans.append(s[i]);
        }
        System.out.println(String.valueOf(ans));
     }
}
