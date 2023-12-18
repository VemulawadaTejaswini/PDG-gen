import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
         //値を取得
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
        
        //郵便番号の形式と合っているかを確認し、結果を出力
        Pattern pattern = Pattern.compile("^[0-9]{"+ A +"}-[0-9]{"+ B +"}$");
        Matcher matcher = pattern.matcher(S);
        
        if(matcher.find()) {   
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
    //郵便番号の形式チェックを行うメソッド
    //public static boolean isPostalCode(int A, int B, int S) {
    //    boolean result = S.equals("^[0-9]{"  +A+ "}-[0-9]{" +B+ "}$"); //〒A(桁) -(ハイフン) B(桁)
    //    return result;
    //}
    
}