import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;
        String T;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
            T = sc.next();
        }
        int cnt = 0;
        if(S.charAt(0) == T.charAt(0)){
            cnt++;
        }
        if(S.charAt(1) == T.charAt(1)){
            cnt++;
        }
        if(S.charAt(2) == T.charAt(2)){
            cnt++;
        }
        System.out.println( cnt);
    }

}
