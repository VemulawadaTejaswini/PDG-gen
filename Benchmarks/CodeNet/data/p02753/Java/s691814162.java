import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        //バスがあるか
        if((S.charAt(1) == S.charAt(2)) && (S.charAt(2) == S.charAt(3))) {  //すべて同じ鉄道会社であればNo
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
    }
}