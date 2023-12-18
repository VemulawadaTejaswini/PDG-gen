import java.util.*;

public class NoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //切り出しする文字列
        String S = sc.next();
        String T = sc.next();
        if(T.startsWith(S) && T.length() == S.length() + 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
