import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = isKaibun(s);
        if(ans) ans = isKaibun(s.substring(0, s.length()/2));
        if(ans) ans = isKaibun(s.substring(s.length()/2 + s.length()%2, s.length()));
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }


    private static boolean isKaibun(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
