import java.util.*;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if(!isKaibun(S)) {
            System.out.println("No");
            return;
        }
        if(!isKaibun(S.substring(0, (S.length()-1)/2))) {
            System.out.println("No");
            return;
        }
        if(!isKaibun(S.substring((S.length()+3)/2 - 1, S.length()))) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
     }

     static boolean isKaibun(String S) {
//        System.out.println(S);
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) != S.charAt(S.length()-1-i)) return false;
         }
        return true;
     }
}
