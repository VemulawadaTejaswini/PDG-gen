import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int x,y;
        if(S.charAt(0) == S.charAt(1)) {
            x=2; y=3;
        } else if(S.charAt(0) == S.charAt(2)) {
            x=1; y=3;
        } else if(S.charAt(0) == S.charAt(3)) {
            x=1; y=2;
        } else {
            System.out.println("No");
            return;
        }
        if(S.charAt(x) != S.charAt(y)) {
            System.out.println("No");
            return;
        }
        if(S.charAt(0) == S.charAt(x)) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        return;
    }
}